package com.yzx.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.yzx.dao.ArticleCategoryDao;
import com.yzx.entity.ArticleCategory;
import com.yzx.entity.ArticleContent;
import com.yzx.factory.ArticleFactory;
import com.yzx.factory.impl.ArticleFactoryImpl;

public class ArticleCategoryDaoImpl implements ArticleCategoryDao {
	private ArticleCategoryDao ariticleCategoryDao;
	
	public ArticleCategoryDaoImpl() {
		super();
	}

	@Override
	public int insertArticleCategory(ArticleCategory ArticleCategory) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateArticleCategory(ArticleCategory ArticleCategory) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int deleteArticleCategory(ArticleCategory ArticleCategory) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public ArticleCategory findArticleCategoryById(String ArticleCategoryId) {
		ArticleFactory articleFactory=new ArticleFactoryImpl();
		return (ArticleCategory) articleFactory.createAbsAbsArticleCategeory();
	}

	@Override
	public List<ArticleCategory> findAllArticleCategory() {
		List<ArticleCategory> articles=new ArrayList<>();
		ArticleFactory articleFactory=new ArticleFactoryImpl();
		articles.add((ArticleCategory) articleFactory.createAbsAbsArticleCategeory());
		articles.add((ArticleCategory) articleFactory.createAbsAbsArticleCategeory());
		return articles;
	}

	@Override
	public void setArticleCategoryDao(ArticleCategoryDao articleCategoryDao) {
		this.ariticleCategoryDao = articleCategoryDao;
	}

}
