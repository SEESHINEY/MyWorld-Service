package com.yzx.factory.impl;

import java.util.HashSet;
import java.util.Set;

import com.yzx.entity.Article;
import com.yzx.entity.ArticleCategory;
import com.yzx.factory.AbsArticle;
import com.yzx.factory.AbsArticleCategory;
import com.yzx.factory.AbsArticleContent;
import com.yzx.factory.ArticleFactory;
import com.yzx.identifier.ArticleType;
import com.yzx.identifier.ID;
import com.yzx.identifier.IDFactory;
import com.yzx.identifier.impl.ArticleCategoryIDFactory;
import com.yzx.identifier.impl.ArticleIDFactory;

public class ArticleFactoryImpl implements ArticleFactory {
	private ID articleId;

	@Override
	public AbsArticle createAbsArticle() {
		IDFactory idFactory = new ArticleIDFactory();
		articleId = idFactory.createId();
		AbsArticle article = new ArticleAdaptor();
		article.setArticleId(articleId.getId());
		article.setArticleStatus(ArticleType.VALIDATING);
		article.setArticleTitle("Jersey之@GET");
		article.setGenTime(Integer.valueOf(articleId.getTime()));
		article.setAbsArticleContent(createAbsAbsArticleContent());
		return article;
	}

	@Override
	public AbsArticleContent createAbsAbsArticleContent() {
		AbsArticleContent articleContent = new ArticleContentAdaptor();
		articleContent.setArticleId(articleId.getId());
		articleContent.setArticleContent("关于Jersey的扒拉扒拉扒拉");
		return articleContent;
	}

	@Override
	public AbsArticleCategory createAbsAbsArticleCategeory() {
		byte b = 0;
		IDFactory idFactory = new ArticleCategoryIDFactory();
		ID categoryId = idFactory.createId();
		AbsArticleCategory articleCategory = new ArticleCategoryAdaptor();
		AbsArticle article = createAbsArticle();
		Set<Article> articles = new HashSet<>();
		articleCategory.setCategoryId(categoryId.getId());
		articleCategory
				.setArticleCategory((ArticleCategory) createAbsAbsTopArticleCategeory());
		articleCategory.setCategoryName("IT学习");// For Test,创建不同名称的目录
		articleCategory.setCategoryDesc("IT学习经验分享板块");
		articleCategory.setArticleNode(b);
		articles.add((Article) article);
		articleCategory.setArticles(articles);
		return articleCategory;
	}

	@Override
	public AbsArticleCategory createAbsAbsTopArticleCategeory() {
		byte b = 0;
		IDFactory idFactory = new ArticleCategoryIDFactory();
		ID categoryId = idFactory.createId();
		AbsArticleCategory articleCategory = new ArticleCategoryAdaptor();
		articleCategory.setCategoryId(categoryId.getId());
		articleCategory.setCategoryName("学习");// For Test,创建不同名称的目录
		articleCategory.setCategoryDesc("学习经验分享板块");
		articleCategory.setArticleNode(b);
		return articleCategory;
	}

}
