package com.test.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yzx.dao.ArticleDao;
import com.yzx.dao.impl.ArticleDaoImpl;
import com.yzx.entity.Article;
import com.yzx.factory.ArticleFactory;
import com.yzx.factory.impl.ArticleFactoryImpl;

public class ArticleDaoTest {
	private ArticleDao articleDao;
	private Article article;
	@Before
	public void setUp() throws Exception {
		articleDao=new ArticleDaoImpl();
		ArticleFactory articleFactory=new ArticleFactoryImpl();
		article=(Article) articleFactory.createAbsArticle();
	}

	@After
	public void tearDown() throws Exception {
	}

	

	@Test
	public void testInsertArticle() {
		int actual=articleDao.insertArticle(article);
		assertEquals(1,actual);
	}

	@Test
	public void testUpdateArticle() {
		int actual=articleDao.updateArticle(article);
		assertEquals(1,actual);
	}

	@Test
	public void testDeleteArticle() {
		int actual=articleDao.deleteArticle(article);
		assertEquals(1,actual);
	}

	@Test
	public void testFindArticleById() {
		String id=article.getArticleId();
		article=articleDao.findArticleById(article.getArticleId());
		assertEquals(id,article.getArticleId());
	}

	@Test
	public void testFindAllArticle() {
		List<Article> articles=articleDao.findAllArticle();
		assertNotNull(articles);
	}


}
