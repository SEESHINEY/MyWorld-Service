package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yzx.identifier.ID;
import com.yzx.identifier.IDFactory;
import com.yzx.identifier.IDType;
import com.yzx.identifier.impl.ArticleCategoryID;
import com.yzx.identifier.impl.ArticleCategoryIDFactory;
import com.yzx.identifier.impl.ArticleContentID;
import com.yzx.identifier.impl.ArticleContentIDFactory;
import com.yzx.identifier.impl.ArticleID;
import com.yzx.identifier.impl.ArticleIDFactory;

public class IDTest {

	@Test
	public void testArticleId(){
		ID articleId=new ArticleID();
		assertEqualsArticleID(articleId);
	}
	@Test
	public void testArticleFactory(){
		IDFactory idFactory=new ArticleIDFactory();
		ID id=idFactory.createId();
		assertEqualsArticleID(id);
	}
	@Test
	public void testArticleContentId(){
		ID id=new ArticleContentID();
		assertEqualsArticleContentID(id);
	}
	@Test
	public void testArticleContentFactory(){
		IDFactory idFactory=new ArticleContentIDFactory();
		ID id=idFactory.createId();
		assertEqualsArticleContentID(id);
	}
	@Test
	public void testArticleCategoryId(){
		ID id=new ArticleCategoryID();
		assertEqualsArticleCategoryID(id);
	}
	@Test
	public void testArticleCategoryFactory(){
		IDFactory idFactory=new ArticleCategoryIDFactory();
		ID id=idFactory.createId();
		assertEqualsArticleCategoryID(id);
	}
	private void assertEqualsArticleID(ID actual){
		assertEquals(IDType.ARTICLE,actual.getType());
		assertEqualsID(actual);
	}
	private void assertEqualsArticleContentID(ID actual){
		assertEquals(IDType.ARTICLE_CONTENT,actual.getType());
		assertEqualsID(actual);
	}
	private void assertEqualsArticleCategoryID(ID actual){
		assertEquals(IDType.ARTICLE_CATEGORY,actual.getType());
		assertEqualsID(actual);
	}
	private void assertEqualsID(ID actual){
		System.out.println(actual.getId());
		assertEquals(IDType.ID_LENGTH,actual.getId().length());
		assertEquals(IDType.ID_TYPE_LENGTH,actual.getType().length());
		assertEquals(IDType.ID_TIME_LENGTH,actual.getTime().length());
	}

}
