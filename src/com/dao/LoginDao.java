package com.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.utils.SessionFactoryUtil;

import com.model.Users;

/*
 *  Using hibernate to  interact with database
 */
public class LoginDao {
  public boolean authenticateUser(String username, String password) {
    Users user = getUserFromUserName(username); 
    if (user!= null && user.getPassword().equals(password)) {
      return true;	
    } else {
      return false;
    }
  }
  
  public Users getUserFromUserName(String username) {
    Session session = SessionFactoryUtil.getSessionFactory();
    Users user = null;
    Transaction transaction = null;
    
    try {
      transaction = session.getTransaction();
      transaction.begin();
      Query selectQuery = session.createQuery("from Users where username ='"+username+ "'");
      user = (Users) selectQuery.uniqueResult();
      transaction.commit();
    } catch (Exception e) {
      e.printStackTrace();	
      if (transaction != null) {
        transaction.rollback();	  
      }
    } finally {
      session.close();	
    }
    
    return user;
  }
  
}
