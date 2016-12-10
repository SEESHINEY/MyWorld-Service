package com.yzx.factory;

public interface AbsArticle {
	public String getArticleId();

	public void setArticleId(String articleId);

	public String getCategory();

	public void setCategory(String category);

	public String getArticleTitle();

	public void setArticleTitle(String articleTitle);

	public int getArticleStatus();

	public void setArticleStatus(int articleStatus);

	public int getGenTime();

	public void setGenTime(int genTime);

	public String getArticleDescription();

	public void setArticleDescription(String articleDescription);
	
	public AbsArticleCategory getArticleCategory();
	
	public AbsArticleContent getArticleContent();
}
