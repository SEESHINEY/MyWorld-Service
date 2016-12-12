package com.yzx.resource;

import java.util.Map;
import java.util.TreeMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import com.yzx.entity.Article;
import com.yzx.entity.ArticleCategory;
import com.yzx.factory.ArticleFactory;
import com.yzx.factory.impl.ArticleFactoryImpl;

@Path("articles")
@XmlRootElement
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class ArticleResource {
	private Map<String, Article> articles = new TreeMap<>();
	private ArticleFactory articleFactory;
	private Article article;
	public ArticleResource() {
		super();
		articleFactory = new ArticleFactoryImpl();
		article=(Article) articleFactory.createArticle();
		getArticles().put("1", article);
		getArticles().put("2", article);
	}
	@GET
	public ArticleResource getArticleResource() {
		return this;
	}
	@GET
	@Path("/{name}")
	public ArticleResource getArticleResourceByName(@PathParam("name")String name) {
		return this;
	}
	public Map<String, Article> getArticles() {
		return articles;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	
	
}
