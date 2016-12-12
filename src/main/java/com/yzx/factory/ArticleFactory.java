package com.yzx.factory;

import com.yzx.entity.Article;
import com.yzx.entity.ArticleCategory;
import com.yzx.entity.ArticleContent;

public interface ArticleFactory {
	public Article createArticle();
	public ArticleContent createArticleContent();
	public ArticleCategory createArticleCategeory();
	public ArticleCategory createTopArticleCategeory();
}
