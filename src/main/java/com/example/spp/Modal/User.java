package com.example.spp.Modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "user_id")
	private long userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="dropdown_value")
	private String dropDownValue;

	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long userId, String userName, String password, String dropDownValue) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.dropDownValue = dropDownValue;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
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

	public String getDropDownValue() {
		return dropDownValue;
	}

	public void setDropDownValue(String dropDownValue) {
		this.dropDownValue = dropDownValue;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", dropDownValue="
				+ dropDownValue + ", getUserId()=" + getUserId() + ", getUserName()=" + getUserName()
				+ ", getPassword()=" + getPassword() + ", getDropDownValue()=" + getDropDownValue() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
