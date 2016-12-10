package com.yzx.factory.impl;

import com.yzx.entity.Article;
import com.yzx.factory.AbsArticle;
import com.yzx.factory.AbsArticleCategory;
import com.yzx.factory.AbsArticleContent;

public class ArticleAdaptor extends Article implements AbsArticle {

	@Override
	public AbsArticleCategory getArticleCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbsArticleContent getArticleContent() {
		// TODO Auto-generated method stub
		return null;
	}

}
