package com.yzx.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import com.yzx.dao.ArticleContentDao;
import com.yzx.entity.Article;
import com.yzx.entity.ArticleCategory;
import com.yzx.entity.ArticleContent;
import com.yzx.factory.ArticleFactory;
import com.yzx.factory.impl.ArticleFactoryImpl;

public class ArticleContentDaoImpl extends AbsDao implements ArticleContentDao {
	

	public ArticleContentDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public int insertArticleContent(ArticleContent articleContent) {
		return insertObject(articleContent);
	}

	@Override
	public int updateArticleContent(ArticleContent articleContent) {
		return updateObject(articleContent);
	}

	@Override
	public int deleteArticleContent(ArticleContent articleContent) {
		return deleteObject(articleContent);
	}

	@Override
	public ArticleContent findArticleContentById(String articleContentId) {
		try {
			session = sessionFactory.openSession();
			String hql = "from ArticleContent as ac where ac.articleId=:articleContentId";
			query = session.createQuery(hql);
			query.setString("articleContentId", articleContentId);
			return (ArticleContent) query.list().get(0);
		} catch (Exception e) {
			queryError(e);
			return null;
		} finally {
			closeSession();
		}
	}

	@Override
	public List<ArticleContent> findAllArticleContent() {
		try {
			String hql = "from ArticleContent";
			return query(hql);
		} catch (Exception e) {
			queryError(e);
			return null;
		} finally {
			closeSession();
		}
	}
}
