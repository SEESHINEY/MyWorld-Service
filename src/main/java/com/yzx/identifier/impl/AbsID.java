package com.yzx.identifier.impl;

import com.yzx.identifier.ID;
import com.yzx.identifier.IDType;
import com.yzx.util.WorldUtils;

public abstract class AbsID implements ID {
	private String time;
	public AbsID() {
		String s=String.valueOf(System.currentTimeMillis());
		time=s.substring(0,IDType.ID_TIME_LENGTH);
	}

	@Override
	public String getId() {
		return getType()+getTime()+WorldUtils.random(IDType.ID_RANDOM_LENGTH);
	}

	@Override
	public abstract String getType();

	@Override
	public String getTime() {
		return time;
	}

}
