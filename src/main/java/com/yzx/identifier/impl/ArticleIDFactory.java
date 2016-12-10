package com.yzx.identifier.impl;

import com.yzx.identifier.ID;
import com.yzx.identifier.IDFactory;

public class ArticleIDFactory implements IDFactory {

	@Override
	public ID createId() {
		return new ArticleID();
	}

}
