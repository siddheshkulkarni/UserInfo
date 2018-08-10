package com.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.model.Users;
import com.utils.SessionFactoryUtil;


/*
 *  Using hibernate to  interact with database
 */
public class HomeDao {
  public void deleteUser(Users user) {
	  System.out.println("================== username ================ "+user);
	     Session session = SessionFactoryUtil.getSessionFactory();
	     boolean result = false;
	     Transaction transaction = null;
	     try{
	    	 transaction = session.getTransaction();
	    	 transaction.begin();
	         Query query =session.createQuery("DELETE Users where username='"+user.getUserName()+"'");   
	         query.executeUpdate();
	     }catch(Exception ex){
	         if(transaction!=null){
	        	 transaction.rollback();
	         }
	     }finally{
	         session.close();
	     }  
  }
}
