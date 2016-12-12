package com.test.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yzx.dao.ArticleCategoryDao;
import com.yzx.dao.ArticleDao;
import com.yzx.dao.impl.ArticleCategoryDaoImpl;
import com.yzx.dao.impl.ArticleDaoImpl;
import com.yzx.entity.Article;
import com.yzx.entity.ArticleCategory;
import com.yzx.entity.ArticleContent;
import com.yzx.factory.ArticleFactory;
import com.yzx.factory.impl.ArticleFactoryImpl;
import com.yzx.util.HUtil;

public class ArticleDaoTest {
	private ArticleDao articleDao;
	private ArticleCategoryDao articleCategoryDao;
	private Article article;
	private ArticleCategory articleCategory;
	private ArticleContent articleContent;
	@Before
	public void setUp() throws Exception {
		articleDao=new ArticleDaoImpl(HUtil.getSessionFactory());
		articleCategoryDao=new ArticleCategoryDaoImpl(HUtil.getSessionFactory());
		ArticleFactory articleFactory=new ArticleFactoryImpl();
		article=(Article) articleFactory.createArticle();
		articleContent=articleFactory.createArticleContent();
		articleContent.setArticle(article);
		articleContent.setArticleId(article.getArticleId());
		articleCategory=articleFactory.createTopArticleCategeory();
		article.setArticleCategory(articleCategory);
		article.setArticleContent(articleContent);
		articleCategoryDao.insertArticleCategory(articleCategory);
	}

	@After
	public void tearDown() throws Exception {
	}

	

	@Test
	public void testInsertArticle() {
		int actual=articleDao.insertArticle(article);
		assertEquals(1,actual);
	}

//	@Test
	public void testUpdateArticle() {
		int actual=articleDao.updateArticle(article);
		assertEquals(1,actual);
	}

//	@Test
	public void testDeleteArticle() {
		int actual=articleDao.deleteArticle(article);
		assertEquals(1,actual);
	}

//	@Test
	public void testFindArticleById() {
		String id=article.getArticleId();
		article=articleDao.findArticleById(article.getArticleId());
		assertEquals(id,article.getArticleId());
	}

//	@Test
	public void testFindAllArticle() {
		List<Article> articles=articleDao.findAllArticle();
		assertNotNull(articles);
	}


}
