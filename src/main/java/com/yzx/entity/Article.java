package com.yzx.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Article implements java.io.Serializable {

	private String articleId;
	private ArticleCategory articleCategory;
	private String articleTitle;
	private int articleStatus;
	private int genTime;
	private String articleDescription;
	private ArticleContent articleContent;

	public Article() {
	}

	public Article(String articleId, ArticleCategory articleCategory,
			String articleTitle, int articleStatus, int genTime) {
		this.articleId = articleId;
		this.articleCategory = articleCategory;
		this.articleTitle = articleTitle;
		this.articleStatus = articleStatus;
		this.genTime = genTime;
	}

	public Article(String articleId, ArticleCategory articleCategory,
			String articleTitle, int articleStatus, int genTime,
			String articleDescription, ArticleContent articleContent) {
		this.articleId = articleId;
		this.articleCategory = articleCategory;
		this.articleTitle = articleTitle;
		this.articleStatus = articleStatus;
		this.genTime = genTime;
		this.articleDescription = articleDescription;
		this.articleContent = articleContent;
	}

	public String getArticleId() {
		return this.articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public ArticleCategory getArticleCategory() {
		return this.articleCategory;
	}

	public void setArticleCategory(ArticleCategory articleCategory) {
		this.articleCategory = articleCategory;
	}

	public String getArticleTitle() {
		return this.articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public int getArticleStatus() {
		return this.articleStatus;
	}

	public void setArticleStatus(int articleStatus) {
		this.articleStatus = articleStatus;
	}

	public int getGenTime() {
		return this.genTime;
	}

	public void setGenTime(int genTime) {
		this.genTime = genTime;
	}

	public String getArticleDescription() {
		return this.articleDescription;
	}

	public void setArticleDescription(String articleDescription) {
		this.articleDescription = articleDescription;
	}

	public ArticleContent getArticleContent() {
		return this.articleContent;
	}

	public void setArticleContent(ArticleContent articleContent) {
		this.articleContent = articleContent;
	}

}
