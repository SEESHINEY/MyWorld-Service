package com.yzx.dao;

import java.util.List;

import com.yzx.entity.Article;

public interface ArticleDao {
	public int insertArticle(Article Article);
	public int updateArticle(Article Article);
	public int deleteArticle(Article Article);
	public Article findArticleById(String ArticleId);
	public List<Article> findAllArticle();
}
