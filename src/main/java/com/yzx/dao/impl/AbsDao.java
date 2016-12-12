package com.yzx.dao.impl;


import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public abstract class AbsDao {
	protected SessionFactory sessionFactory;
	protected Session session;
	protected Transaction transaction;
	protected Query query;
	protected List resultList;
	protected static Logger logger=Logger.getLogger(AbsDao.class);
	public AbsDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	
	protected int insertObject(Object object){
		try {
			return insert(object);
		} catch (Exception e) {
			return insertError(e);
		} finally {
			closeSession();
		}
	}
	protected int insert(Object object) throws Exception{
		try {
			beginTransaction();
			session.save(object);
			session.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			throw e;
		}
		
	}
	protected int deleteObject(Object object){
		try {
			return delete(object);
		} catch (Exception e) {
			return deleteError(e);
		} finally {
			closeSession();
		}
	}
	protected int delete(Object object) throws Exception{
		beginTransaction();
		if (session==null) {
			closeSession();
			throw new Exception("session关闭");
		}
		session.delete(object);
		session.getTransaction().commit();
		return 1;
	}
	protected int updateObject(Object object){
		try {
			return update(object);
		} catch (Exception e) {
			return updateError(e);
		} finally {
			closeSession();
		}
	}
	protected int update(Object object){
		beginTransaction();
		session.update(object);
		session.getTransaction().commit();
		return 1;
	}
	protected List query(String hql){
		session = sessionFactory.openSession();
		query=session.createQuery(hql);
		resultList=query.list();
		return resultList;
	}
	
	protected int insertError(Exception e) {
		return error("插入错误",e);	
	}
	protected int updateError(Exception e) {
		return error("更新错误",e);	
	}
	protected int deleteError(Exception e) {
		return error("删除错误",e);	
	}
	protected void queryError(Exception e) {
		error("查询错误",e);	
	}
	protected int error(Object msg,Exception e) {
		rollback();
		logger.error(msg+e.getMessage());
		e.printStackTrace();
		return 0;
	}
	protected void beginTransaction(){
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
	}
	protected void closeSession() {
		if (session != null) {
			session.close();
		}
	}
	protected void rollback(){
		if (transaction != null) {
			transaction.rollback();
		}
	}
}
