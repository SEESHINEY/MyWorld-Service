package com.yzx.util;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HUtil {
	private static SessionFactory sessionFactory;
	private static Logger logger=Logger.getLogger(HUtil.class);
  static {
  	// A SessionFactory is set up once for an application!
  	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
  			.configure() // configures settings from hibernate.cfg.xml
  			.build();
  	try {
  		sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
  	}
  	catch (Exception e) {
  		// The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
  		// so destroy it manually.
  		StandardServiceRegistryBuilder.destroy( registry );
  	}
  }
  public static Session getSession() throws HibernateException {
      return sessionFactory.openSession();
  }
  public static SessionFactory getSessionFactory() throws HibernateException {
      return sessionFactory;
  }
}
