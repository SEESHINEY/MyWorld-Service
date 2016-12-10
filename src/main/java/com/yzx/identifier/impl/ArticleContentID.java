package com.yzx.identifier.impl;

import com.yzx.identifier.IDType;

public class ArticleContentID extends AbsID {
	private final String TYPE = IDType.ARTICLE_CONTENT;

	public ArticleContentID() {
		super();
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
