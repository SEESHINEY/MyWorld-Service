package com.yzx.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.yzx.dao.ArticleDao;
import com.yzx.entity.Article;
import com.yzx.factory.ArticleFactory;
import com.yzx.factory.impl.ArticleFactoryImpl;

public class ArticleDaoImpl implements ArticleDao {
	private ArticleDao articleDao;
	
	public ArticleDaoImpl() {
		super();
	}

	@Override
	public int insertArticle(Article Article) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateArticle(Article Article) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int deleteArticle(Article Article) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Article findArticleById(String ArticleId) {
		ArticleFactory articleFactory=new ArticleFactoryImpl();
		return (Article) articleFactory.createAbsArticle();
	}

	@Override
	public List<Article> findAllArticle() {
		List<Article> articles=new ArrayList<>();
		ArticleFactory articleFactory=new ArticleFactoryImpl();
		articles.add((Article) articleFactory.createAbsArticle());
		articles.add((Article) articleFactory.createAbsArticle());
		return articles;
	}

	@Override
	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	
}
