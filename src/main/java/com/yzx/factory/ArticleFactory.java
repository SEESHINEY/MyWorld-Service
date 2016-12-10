package com.yzx.factory;

public interface ArticleFactory {
	public AbsArticle createAbsArticle();
	public AbsArticleContent createAbsAbsArticleContent();
	public AbsArticleCategory createAbsAbsArticleCategeory();
}
