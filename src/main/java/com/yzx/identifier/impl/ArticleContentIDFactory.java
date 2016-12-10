package com.yzx.identifier.impl;

import com.yzx.identifier.ID;
import com.yzx.identifier.IDFactory;

public class ArticleContentIDFactory implements IDFactory {

	@Override
	public ID createId() {
		return new ArticleContentID();
	}

}
