package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
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

public class T {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int indexOfString=(int) (Math.random()*1);
		System.out.println(indexOfString);
//		assertEquals("00000000123", s);
	}
	
}
