package com.yzx.identifier.impl;

import com.yzx.identifier.IDType;

public class ArticleID extends AbsID {
	private final String TYPE = IDType.ARTICLE;

	public ArticleID() {
		super();
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
