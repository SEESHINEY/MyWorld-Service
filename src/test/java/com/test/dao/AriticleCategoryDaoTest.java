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
import com.yzx.util.HUtil;

public class AriticleCategoryDaoTest {
	private ArticleCategoryDao articleCategoryDao;
	private ArticleCategory articleCategory;
	private List<ArticleCategory> articleCategories;
	@Before
	public void setUp() throws Exception {
		articleCategoryDao=new ArticleCategoryDaoImpl(HUtil.getSessionFactory());
		ArticleFactory articleFactory=new ArticleFactoryImpl();
		articleCategory=articleFactory.createTopArticleCategeory();
		articleCategories=articleCategoryDao.findAllArticleCategory();
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
		articleCategory=articleCategories.get(0);
		articleCategory.setCategoryName("修改后的目录");
		articleCategory.setCategoryDesc("修改");
		int actual=articleCategoryDao.updateArticleCategory(articleCategory);
		assertEquals(1,actual);
	}

	@Test
	public void testDeleteArticleCategory() {
		articleCategory=articleCategories.get(1);
		int actual=articleCategoryDao.deleteArticleCategory(articleCategory);
		assertEquals(1,actual);
	}

	@Test
	public void testFindArticleCategoryById() {
		articleCategory=articleCategories.get(2);
		String id=articleCategory.getCategoryId();
		System.out.println(id);
		articleCategory=articleCategoryDao.findArticleCategoryById(id);
		assertEquals(id,articleCategory.getCategoryId());
	}

	@Test
	public void testFindAllArticleCategory() {
		articleCategories=articleCategoryDao.findAllArticleCategory();
		assertNotNull(articleCategories);
		System.out.println(articleCategories.size());
	}

}
