package com.yzx.dao;

import java.util.List;

import com.yzx.entity.ArticleCategory;

public interface ArticleCategoryDao {
	public int insertArticleCategory(ArticleCategory ArticleCategory);
	public int updateArticleCategory(ArticleCategory ArticleCategory);
	public int deleteArticleCategory(ArticleCategory ArticleCategory);
	public ArticleCategory findArticleCategoryById(String ArticleCategoryId);
	public List<ArticleCategory> findAllArticleCategory();
	public void setArticleCategoryDao(ArticleCategoryDao articleCategoryDao);
}
