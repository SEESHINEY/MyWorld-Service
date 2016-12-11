package com.test.resource;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.glassfish.grizzly.http.server.HttpServer;

public class TestCourseResourse {
	private HttpServer server;
	private WebTarget target;
	private static Logger logger = Logger.getLogger(TestCourseResourse.class);

	@Before
	public void setUp() throws Exception {
		server = Main.startServer();

		Client c = ClientBuilder.newClient();
		target = c.target(Main.BASE_URI);

		Logger logger = Logger.getLogger(TestCourseResourse.class);
	}

	@After
	public void tearDown() throws Exception {
		server.stop();
	}

	

	@Test
//	@Ignore
	public void testInsertCourse() {
		Form form = new Form();
		form.param("id", "151");
		form.param("name", "SSD8");

		String actual = target
		    .path("course")
		    .request()
		    .post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED),
		        String.class);
		assertEquals("插入成功", actual);
	}

	@Test
	@Ignore
	public void testUpdateCourseById() {
		Form form = new Form();
		form.param("id", "127");
		form.param("name", "SSD9");

		String actual = target
		    .path("course")
		    .request()
		    .put(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED),
		        String.class);
		assertEquals("修改成功", actual);
	}
}
