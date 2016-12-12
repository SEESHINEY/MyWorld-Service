package com.yzx.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import com.yzx.dao.ArticleDao;
import com.yzx.entity.Article;
import com.yzx.entity.ArticleCategory;
import com.yzx.factory.ArticleFactory;
import com.yzx.factory.impl.ArticleFactoryImpl;

public class ArticleDaoImpl extends AbsDao implements ArticleDao {
	

	public ArticleDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public int insertArticle(Article article) {
		return insertObject(article);
	}

	@Override
	public int updateArticle(Article article) {
		return updateObject(article);
	}

	@Override
	public int deleteArticle(Article article) {
		return deleteObject(article);
	}

	@Override
	public Article findArticleById(String articleId) {
		try {
			session = sessionFactory.openSession();
			String hql = "from Article as ac where ac.articleId=:articleId";
			query = session.createQuery(hql);
			query.setString("articleId", articleId);
			return (Article) query.list().get(0);
		} catch (Exception e) {
			queryError(e);
			return null;
		} finally {
			closeSession();
		}
	}

	@Override
	public List<Article> findAllArticle() {
		try {
			String hql = "from Article";
			return query(hql);
		} catch (Exception e) {
			queryError(e);
			return null;
		} finally {
			closeSession();
		}
	}

	
	
}
