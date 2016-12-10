package com.yzx.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.yzx.dao.ArticleContentDao;
import com.yzx.entity.Article;
import com.yzx.entity.ArticleContent;
import com.yzx.factory.ArticleFactory;
import com.yzx.factory.impl.ArticleFactoryImpl;

public class ArticleContentDaoImpl implements ArticleContentDao {
	private ArticleContentDao articleContentDao;
	
	public ArticleContentDaoImpl() {
		super();
	}

	@Override
	public int insertArticleContent(ArticleContent articleContent) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateArticleContent(ArticleContent articleContent) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int deleteArticleContent(ArticleContent articleContent) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public ArticleContent findArticleContentById(String articleContentId) {
		ArticleFactory articleFactory=new ArticleFactoryImpl();
		articleFactory.createAbsArticle();
		return (ArticleContent) articleFactory.createAbsAbsArticleContent();
	}

	@Override
	public List<ArticleContent> findAllArticleContent() {
		List<ArticleContent> articles=new ArrayList<>();
		ArticleFactory articleFactory=new ArticleFactoryImpl();
		articleFactory.createAbsArticle();
		articles.add((ArticleContent) articleFactory.createAbsAbsArticleContent());
		articles.add((ArticleContent) articleFactory.createAbsAbsArticleContent());
		return articles;
	}

	@Override
	public void setArticleContentDao(ArticleContentDao articleContentDao) {
		this.articleContentDao=articleContentDao;
	}

	
	
}
