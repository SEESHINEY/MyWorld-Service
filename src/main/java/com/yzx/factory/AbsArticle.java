package com.yzx.factory;

public interface AbsArticle {
	public String getArticleId();

	public void setArticleId(String articleId);

	public String getArticleTitle();

	public void setArticleTitle(String articleTitle);

	public int getArticleStatus();

	public void setArticleStatus(int articleStatus);

	public int getGenTime();

	public void setGenTime(int genTime);

	public String getArticleDescription();

	public void setArticleDescription(String articleDescription);

	public AbsArticleCategory getAbsArticleCategory();

	public void setAbsArticleCategory(AbsArticleCategory articleCategory);

	public AbsArticleContent getAbsArticleContent();

	public void setAbsArticleContent(AbsArticleContent articleContent);
}
