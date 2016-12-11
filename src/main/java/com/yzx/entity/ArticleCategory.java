package com.yzx.entity;


import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class ArticleCategory implements java.io.Serializable {

	private String categoryId;
	private ArticleCategory articleCategory;
	private String categoryName;
	private String categoryDesc;
	private byte articleNode;
	private Set<Article> articles = new HashSet<Article>(0);
	private Set<ArticleCategory> articleCategories = new HashSet<ArticleCategory>(
			0);

	public ArticleCategory() {
	}

	public ArticleCategory(String categoryId, ArticleCategory articleCategory,
			String categoryName, byte articleNode) {
		this.categoryId = categoryId;
		this.articleCategory = articleCategory;
		this.categoryName = categoryName;
		this.articleNode = articleNode;
	}

	public ArticleCategory(String categoryId, ArticleCategory articleCategory,
			String categoryName, String categoryDesc, byte articleNode,
			Set<Article> articles, Set<ArticleCategory> articleCategories) {
		this.categoryId = categoryId;
		this.articleCategory = articleCategory;
		this.categoryName = categoryName;
		this.categoryDesc = categoryDesc;
		this.articleNode = articleNode;
		this.articles = articles;
		this.articleCategories = articleCategories;
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public ArticleCategory getArticleCategory() {
		return this.articleCategory;
	}

	public void setArticleCategory(ArticleCategory articleCategory) {
		this.articleCategory = articleCategory;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDesc() {
		return this.categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public byte getArticleNode() {
		return this.articleNode;
	}

	public void setArticleNode(byte articleNode) {
		this.articleNode = articleNode;
	}

	public Set<Article> getArticles() {
		return this.articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

	public Set<ArticleCategory> getArticleCategories() {
		return this.articleCategories;
	}

	public void setArticleCategories(Set<ArticleCategory> articleCategories) {
		this.articleCategories = articleCategories;
	}

}
