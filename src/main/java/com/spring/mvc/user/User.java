package com.spring.mvc.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	private String city;
	private String pincode;
	
	public User(int userId, String userName, String city, String pincode) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.city = city;
		this.pincode = pincode;
	}

	public User() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
}
