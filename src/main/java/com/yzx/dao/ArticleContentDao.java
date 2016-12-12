package com.yzx.dao;

import java.util.List;

import com.yzx.entity.ArticleContent;

public interface ArticleContentDao {
	public int insertArticleContent(ArticleContent articleContent);
	public int updateArticleContent(ArticleContent articleContent);
	public int deleteArticleContent(ArticleContent articleContent);
	public ArticleContent findArticleContentById(String articleContentId);
	public List<ArticleContent> findAllArticleContent();
}
