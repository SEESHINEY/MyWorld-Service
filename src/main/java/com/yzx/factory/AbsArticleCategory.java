package com.yzx.factory;

public interface AbsArticleCategory {
	public String getPId();

	public void setPId(String PId);

	public String getCategoryId();

	public void setCategoryId(String categoryId);

	public String getCategoryName();

	public void setCategoryName(String categoryName);

	public String getCategoryDesc();

	public void setCategoryDesc(String categoryDesc);

	public byte getArticleNode();

	public void setArticleNode(byte articleNode);
}
