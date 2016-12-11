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

import com.yzx.entity.ArticleCategory;

public class ArticleCategoryResourseTest extends TestSupport{
	private HttpServer server;
	private WebTarget target;
	private static Logger logger = Logger.getLogger(ArticleCategoryResourseTest.class);

	@Before
	public void setUp() throws Exception {
		server = Main.startServer();

		Client c = ClientBuilder.newClient();
		target = c.target(Main.BASE_URI);
	}

	@After
	public void tearDown() throws Exception {
		server.stop();
	}

	@Test
	public void testGetCategories(){
		ArticleCategory articleCategory=target.path("articleCategory").request().get(ArticleCategory.class);
		assertNotNull(articleCategory);
	}
	
	@Test
	public void testGetCategoriesResourceAsJson(){
		String articleCategory=target.path("articleCategory").request(MediaType.APPLICATION_JSON).get(String.class);
		assertJsonResponse(articleCategory);
		System.out.println(articleCategory);
	}
	
	@Test
	public void testGetCategoriesResourceAsXml(){
		String articleCategory=target.path("articleCategory").request(MediaType.APPLICATION_XML).get(String.class);
		assertXmlResponse(articleCategory);
		System.out.println(articleCategory);
	}
	
}
