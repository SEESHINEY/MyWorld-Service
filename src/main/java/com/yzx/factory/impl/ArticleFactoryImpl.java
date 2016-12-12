package com.yzx.factory.impl;

import java.util.HashSet;
import java.util.Set;

import com.yzx.entity.Article;
import com.yzx.entity.ArticleCategory;
import com.yzx.entity.ArticleContent;

import com.yzx.factory.ArticleFactory;
import com.yzx.identifier.ArticleType;
import com.yzx.identifier.ID;
import com.yzx.identifier.IDFactory;
import com.yzx.identifier.impl.ArticleCategoryIDFactory;
import com.yzx.identifier.impl.ArticleIDFactory;

public class ArticleFactoryImpl implements ArticleFactory {
	private ID articleId;
	private ArticleCategory articleCategory;
	private Article article;
	private ArticleContent articleContent;

	@Override
	public Article createArticle() {
		IDFactory idFactory = new ArticleIDFactory();
		articleId = idFactory.createId();
		article = new Article();
		article.setArticleId(articleId.getId());
		article.setArticleStatus(ArticleType.VALIDATING);
		article.setArticleTitle("Jersey之@GET");
		article.setArticleCategory(articleCategory);
		article.setGenTime(Integer.valueOf(articleId.getTime()));
		article.setArticleContent(createArticleContent());
		return article;
	}

	@Override
	public ArticleContent createArticleContent() {
		articleContent = new ArticleContent();
		articleContent.setArticle(article);
		articleContent.setArticleId(article.getArticleId());
		articleContent.setArticleContent("关于Jersey的扒拉扒拉扒拉");
		return articleContent;
	}

	@Override
	public ArticleCategory createArticleCategeory() {
		byte b = 0;
		IDFactory idFactory = new ArticleCategoryIDFactory();
		ID categoryId = idFactory.createId();
		articleCategory = new ArticleCategory();
		Article article = createArticle();
		Set<Article> articles = new HashSet<>();
		articleCategory.setCategoryId(categoryId.getId());
		articleCategory
				.setArticleCategory((ArticleCategory) createTopArticleCategeory());
		articleCategory.setCategoryName("IT学习");// For Test,创建不同名称的目录
		articleCategory.setCategoryDesc("IT学习经验分享板块");
		articleCategory.setArticleNode(b);
		articles.add((Article) article);
		articleCategory.setArticles(articles);
		return articleCategory;
	}

	@Override
	public ArticleCategory createTopArticleCategeory() {
		byte b = 0;
		IDFactory idFactory = new ArticleCategoryIDFactory();
		ID categoryId = idFactory.createId();
		articleCategory = new ArticleCategory();
		articleCategory.setCategoryId(categoryId.getId());
		articleCategory.setCategoryName("学习");// For Test,创建不同名称的目录
		articleCategory.setCategoryDesc("学习经验分享板块");
		articleCategory.setArticleNode(b);
		articleCategory.setArticleCategory(articleCategory);
		return articleCategory;
	}

}
