package com.yzx.factory;

import java.util.Set;

import com.yzx.entity.Article;
import com.yzx.entity.ArticleCategory;

public interface AbsArticleCategory {
	public String getCategoryId();

	public void setCategoryId(String categoryId);

	public ArticleCategory getArticleCategory();

	public void setArticleCategory(ArticleCategory articleCategory);

	public String getCategoryName();

	public void setCategoryName(String categoryName);

	public String getCategoryDesc();

	public void setCategoryDesc(String categoryDesc);

	public byte getArticleNode();

	public void setArticleNode(byte articleNode);

	public Set<Article> getArticles();

	public void setArticles(Set<Article> articles);

	public Set<ArticleCategory> getArticleCategories();

	public void setArticleCategories(Set<ArticleCategory> articleCategories);
}
