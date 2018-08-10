package com.utils;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.model.Users;

public class SessionFactoryUtil {
  
  public static Session getSessionFactory() {
	SessionFactory sessionFactory = null;  
    try {
    	 Configuration configuration = new Configuration();
    	configuration.addAnnotatedClass(Users.class);
    	sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();	  	
    } catch(Exception e) {
      e.printStackTrace();  	
    }
    return sessionFactory.openSession();
  }
}
