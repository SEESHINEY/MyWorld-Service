package com.test.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yzx.dao.ArticleCategoryDao;
import com.yzx.dao.ArticleContentDao;
import com.yzx.dao.ArticleDao;
import com.yzx.dao.impl.ArticleCategoryDaoImpl;
import com.yzx.dao.impl.ArticleContentDaoImpl;
import com.yzx.dao.impl.ArticleDaoImpl;
import com.yzx.entity.Article;
import com.yzx.entity.ArticleCategory;
import com.yzx.entity.ArticleContent;
import com.yzx.factory.ArticleFactory;
import com.yzx.factory.impl.ArticleFactoryImpl;
import com.yzx.util.HUtil;

public class AriticleContentDaoTest {
	private ArticleDao articleDao;
	private ArticleCategoryDao articleCategoryDao;
	private Article article;
	private ArticleCategory articleCategory;
	private ArticleContentDao articleContentDao;
	private ArticleContent articleContent;

	@Before
	public void setUp() throws Exception {
		articleContentDao = new ArticleContentDaoImpl(HUtil.getSessionFactory());
		articleDao = new ArticleDaoImpl(HUtil.getSessionFactory());
		articleCategoryDao = new ArticleCategoryDaoImpl(HUtil.getSessionFactory());
		ArticleFactory articleFactory = new ArticleFactoryImpl();
		
		article = articleFactory.createArticle();
		articleContent = articleFactory.createArticleContent();
		
		articleCategory = articleFactory.createTopArticleCategeory();
		article.setArticleCategory(articleCategory);
		articleCategoryDao.insertArticleCategory(articleCategory);
		articleDao.insertArticle(article);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsertArticleContent() {
		int actual = articleContentDao.insertArticleContent(articleContent);
		assertEquals(1, actual);
	}

//	 @Test
	public void testUpdateArticleContent() {
		int actual = articleContentDao.updateArticleContent(articleContent);
		assertEquals(1, actual);
	}

//	 @Test
	public void testDeleteArticleContent() {
		int actual = articleContentDao.deleteArticleContent(articleContent);
		assertEquals(1, actual);
	}

	 @Test
	public void testFindArticleContentById() {
		String id = articleContent.getArticleId();
		articleContent = articleContentDao.findArticleContentById(id);
		assertEquals(id, articleContent.getArticleId());
	}

	// @Test
	public void testFindAllArticleContent() {
		List<ArticleContent> articleContents = articleContentDao
				.findAllArticleContent();
		assertNotNull(articleContents);
	}

}
