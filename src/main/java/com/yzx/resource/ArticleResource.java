package com.yzx.resource;

import java.util.Map;
import java.util.TreeMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yzx.entity.Article;
import com.yzx.entity.ArticleCategory;

//@Path("articles")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class ArticleResource {
	private Map<String, Article> articles = new TreeMap<>();
	private ArticleCategory articleCategory;
	
	public ArticleResource() {
		super();
		
	}
//	@GET
	public ArticleResource getArticles() {
		return this;
	}
//	@GET
	public void getArticles(int startPos, int size) {
		
	}
	
}
