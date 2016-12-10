package com.yzx.identifier.impl;

import com.yzx.identifier.IDType;

public class ArticleCategoryID extends AbsID {
	private final String TYPE = IDType.ARTICLE_CATEGORY;

	public ArticleCategoryID() {
		super();
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
