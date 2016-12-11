package com.yzx.factory.impl;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yzx.entity.Article;
import com.yzx.entity.ArticleCategory;
import com.yzx.entity.ArticleContent;
import com.yzx.factory.AbsArticle;
import com.yzx.factory.AbsArticleCategory;
import com.yzx.factory.AbsArticleContent;
public class ArticleAdaptor extends Article implements AbsArticle {

	@Override
	public AbsArticleCategory getAbsArticleCategory() {
		return (AbsArticleCategory) super.getArticleCategory();
	}

	@Override
	public AbsArticleContent getAbsArticleContent() {
		return (AbsArticleContent) super.getArticleContent();
	}

	@Override
	public void setAbsArticleCategory(AbsArticleCategory articleCategory) {
		super.setArticleCategory((ArticleCategory) articleCategory);
	}

	@Override
	public void setAbsArticleContent(AbsArticleContent articleContent) {
		super.setArticleContent((ArticleContent) articleContent);
	}
	
}
