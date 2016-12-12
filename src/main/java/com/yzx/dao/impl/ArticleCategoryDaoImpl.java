package com.yzx.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.yzx.dao.ArticleCategoryDao;
import com.yzx.entity.ArticleCategory;

public class ArticleCategoryDaoImpl extends AbsDao implements
		ArticleCategoryDao {

	public ArticleCategoryDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public int insertArticleCategory(ArticleCategory articleCategory) {
		return insertObject(articleCategory);
	}

	@Override
	public int updateArticleCategory(ArticleCategory articleCategory) {
		try {
			return update(articleCategory);
		} catch (Exception e) {
			return updateError(e);
		} finally {
			closeSession();
		}
	}

	@Override
	public int deleteArticleCategory(ArticleCategory articleCategory) {
		try {
			return delete(articleCategory);
		} catch (Exception e) {
			deleteError(e);
			return deleteArticleCategoryById(articleCategory);
		} finally {
			closeSession();
		}
	}

	private int deleteArticleCategoryById(ArticleCategory articleCategory) {
		try {
			ArticleCategory articleCategory1 = new ArticleCategory();
			articleCategory1=articleCategory;
			beginTransaction();
			session.delete(articleCategory1);
			session.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			return deleteError(e);
		} finally {
//			closeSession();
		}
	}

	@Override
	public ArticleCategory findArticleCategoryById(String articleCategoryId) {
		try {
			session = sessionFactory.openSession();
			String hql = "from ArticleCategory as ac where ac.categoryId=:categoryId";
			query = session.createQuery(hql);
			query.setString("categoryId", articleCategoryId);
			return (ArticleCategory) query.list().get(0);
		} catch (Exception e) {
			queryError(e);
			return null;
		} finally {
			closeSession();
		}
	}

	@Override
	public List<ArticleCategory> findAllArticleCategory() {
		try {
			String hql = "from ArticleCategory";
			return query(hql);
		} catch (Exception e) {
			queryError(e);
			return null;
		} finally {
			closeSession();
		}
	}

}
