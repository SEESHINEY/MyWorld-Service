package com.test.resource;

import static org.junit.Assert.*;

import java.util.Map;

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

import com.yzx.entity.Article;
import com.yzx.resource.ArticleResource;

public class ArticleResourseTest extends TestSupport{
	private HttpServer server;
	private WebTarget target;
	private static Logger logger = Logger.getLogger(ArticleResourseTest.class);

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
	public void testGetArticle(){
		ArticleResource articles=target.path("articles").request().get(ArticleResource.class);
		assertNotNull(articles);
		assertNotNull(articles.getArticleResource());
		System.out.println(articles.getArticleResource());
	}
	
	@Test
	public void testGetArticleResourceAsJson(){
		String articles=target.path("articles").request(MediaType.APPLICATION_JSON).get(String.class);
		assertJsonResponse(articles);
		System.out.println(articles);
	}
	
	@Test
	public void testGetArticleResourceAsXml(){
		String articles=target.path("articles").request(MediaType.APPLICATION_XML).get(String.class);
		assertXmlResponse(articles);
		System.out.println(articles);
	}
	
}
