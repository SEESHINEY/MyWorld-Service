package com.yzx.factory.impl;

import javax.xml.bind.annotation.XmlRootElement;

import com.yzx.entity.ArticleCategory;
import com.yzx.factory.AbsArticleCategory;
@XmlRootElement
public class ArticleCategoryAdaptor extends ArticleCategory implements
		AbsArticleCategory {
}
