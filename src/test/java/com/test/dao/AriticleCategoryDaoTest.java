package com.test.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yzx.dao.ArticleCategoryDao;
import com.yzx.dao.impl.ArticleCategoryDaoImpl;
import com.yzx.entity.ArticleCategory;
import com.yzx.entity.ArticleContent;
import com.yzx.factory.ArticleFactory;
import com.yzx.factory.impl.ArticleFactoryImpl;

public class AriticleCategoryDaoTest {
	private ArticleCategoryDao articleCategoryDao;
	private ArticleCategory articleCategory;
	@Before
	public void setUp() throws Exception {
		articleCategoryDao=new ArticleCategoryDaoImpl();
		ArticleFactory articleFactory=new ArticleFactoryImpl();
		articleCategory=(ArticleCategory) articleFactory.createAbsAbsArticleCategeory();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsertArticleCategory() {
		int actual=articleCategoryDao.insertArticleCategory(articleCategory);
		assertEquals(1,actual);
	}

	@Test
	public void testUpdateArticleCategory() {
		int actual=articleCategoryDao.updateArticleCategory(articleCategory);
		assertEquals(1,actual);
	}

	@Test
	public void testDeleteArticleCategory() {
		int actual=articleCategoryDao.deleteArticleCategory(articleCategory);
		assertEquals(1,actual);
	}

	@Test
	public void testFindArticleCategoryById() {
		String id=articleCategory.getCategoryId();
		articleCategory=articleCategoryDao.findArticleCategoryById(id);
		assertEquals(id,articleCategory.getCategoryId());
	}

	@Test
	public void testFindAllArticleCategory() {
		List<ArticleCategory> articleCategories=articleCategoryDao.findAllArticleCategory();
		assertNotNull(articleCategories);
	}

}
