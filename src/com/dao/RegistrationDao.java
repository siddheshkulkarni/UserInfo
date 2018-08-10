package com.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.model.Users;
import com.utils.SessionFactoryUtil;

/*
 *  Using hibernate to  interact with database
 */
public class RegistrationDao {
	public boolean register(Users user){
	     Session session = SessionFactoryUtil.getSessionFactory();
	     if(isUserPresent(user)) {
	    	 return false; 	 
	     } 
	     
	     Transaction transaction = null;
	     try {
	    	 transaction = session.getTransaction();
	    	 transaction.begin();
	         session.saveOrUpdate(user);       
	         transaction.commit();
	     } catch (Exception e) {
	         if (transaction != null) {
	        	 transaction.rollback();
	         }
	         e.printStackTrace();
	     } finally {
	         session.close();
	     } 
	     return true;
	}
	 
	public boolean isUserPresent(Users user){
		System.out.println("================== username ================ "+user.getUserName());
	     Session session = SessionFactoryUtil.getSessionFactory();
	     boolean result = false;
	     Transaction transaction = null;
	     try{
	    	 transaction = session.getTransaction();
	    	 transaction.begin();
	         Query query = session.createQuery("from Users where username='"+user.getUserName()+"'");
	         Users u = (Users)query.uniqueResult();
	         transaction.commit();
	         if(u!=null) result = true;
	     }catch(Exception ex){
	         if(transaction!=null){
	        	 transaction.rollback();
	         }
	     }finally{
	         session.close();
	     }
	     return result;
	  } 
}
