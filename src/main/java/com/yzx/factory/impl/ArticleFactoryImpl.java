package com.yzx.factory.impl;

import com.yzx.factory.AbsArticle;
import com.yzx.factory.AbsArticleCategory;
import com.yzx.factory.AbsArticleContent;
import com.yzx.factory.ArticleFactory;
import com.yzx.identifier.ArticleType;
import com.yzx.identifier.ID;
import com.yzx.identifier.IDFactory;
import com.yzx.identifier.impl.ArticleCategoryIDFactory;
import com.yzx.identifier.impl.ArticleContentIDFactory;
import com.yzx.identifier.impl.ArticleIDFactory;

public class ArticleFactoryImpl implements ArticleFactory {
	private ID articleId;
	@Override
	public AbsArticle createAbsArticle() {
		IDFactory idFactory=new ArticleIDFactory();
		articleId=idFactory.createId();
		AbsArticle article=new ArticleAdaptor();
		article.setArticleId(articleId.getId());
		article.setArticleStatus(ArticleType.VALIDATING);
		article.setArticleTitle("Jersey之@GET");
		article.setGenTime(Integer.valueOf(articleId.getTime()));
		article.setCategory("IT学习");
		return article;
	}

	@Override
	public AbsArticleContent createAbsAbsArticleContent() {
		AbsArticleContent articleContent=new ArticleContentAdaptor();
		articleContent.setArticleId(articleId.getId());
	  articleContent.setArticleContent("关于Jersey的扒拉扒拉扒拉");
		return articleContent;
	}

	@Override
	public AbsArticleCategory createAbsAbsArticleCategeory() {
		byte b=0;
		IDFactory idFactory=new ArticleCategoryIDFactory();
		ID categoryId=idFactory.createId();
		AbsArticleCategory articleCategory=new ArticleCategoryAdaptor();
		articleCategory.setCategoryId(categoryId.getId());
		articleCategory.setPId("0");
		articleCategory.setCategoryName("IT学习");
		articleCategory.setCategoryDesc("学习经验分享板块");
		articleCategory.setArticleNode(b);
		return articleCategory;
	}

}
