package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@javax.persistence.Entity
@javax.persistence.Table(name = "Users")
public class Users implements Serializable {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int userId;
  private String firstName;
  private String lastName;
  private String address;
  private String nationality;
  private String userName;
  private String password;
  
  public Users() {}
  
  public Users(String firstName, String lastName, String address, String nationality, 
		   String userName, String password) {
	  this.firstName  = firstName;
	  this.lastName = lastName;
	  this.address = address;
	  this.nationality = nationality;
	  this.userName = userName;
	  this.password = password;
  }
  
  public int getUserId() {
	return userId;
  }
  
  public void setUserId(int userId) {
	this.userId = userId;
  }
  
  public String getFirstName() {
	return firstName;
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public String getLastName() {
	return lastName;
  }
  
  public void setLastName(String lastName) {
	this.lastName = lastName;
  }
  
  public String getAddress() {
  	return address;
  }
  
  public void setAddress(String address) {
	this.address = address;
  }
  
  public String getNationality() {
	return nationality;
  }
  
  public void setNationality(String nationality) {
	this.nationality = nationality;
  }
  
  public String getUserName() {
	return userName;
  }
  
  public void setUserName(String userName) {
	this.userName = userName;
  }

  public String getPassword() {
	return password;
  }

  public void setPassword(String password) {
	this.password = password;
  }
  
}
