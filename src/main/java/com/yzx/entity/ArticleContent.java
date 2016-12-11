package com.yzx.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ArticleContent implements java.io.Serializable {

	private String articleId;
	private Article article;
	private String articleContent;

	public ArticleContent() {
	}

	public ArticleContent(Article article) {
		this.article = article;
	}

	public ArticleContent(Article article, String articleContent) {
		this.article = article;
		this.articleContent = articleContent;
	}

	public String getArticleId() {
		return this.articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public String getArticleContent() {
		return this.articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

}
