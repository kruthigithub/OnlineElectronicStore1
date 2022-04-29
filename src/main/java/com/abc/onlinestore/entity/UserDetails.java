package com.abc.onlinestore.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	private String password;
	private String emailId;
	private String role;
	private String city;
	private String address;
	private String mobileNumber;
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails(int userId, String userName, String password, String emailId, String role, String city,
			String address, String mobileNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.emailId = emailId;
		this.role = role;
		this.city = city;
		this.address = address;
		this.mobileNumber = mobileNumber;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, city, emailId, mobileNumber, password, role, userId, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDetails other = (UserDetails) obj;
		return Objects.equals(address, other.address) && Objects.equals(city, other.city)
				&& Objects.equals(emailId, other.emailId) && Objects.equals(mobileNumber, other.mobileNumber)
				&& Objects.equals(password, other.password) && Objects.equals(role, other.role)
				&& userId == other.userId && Objects.equals(userName, other.userName);
	}
	
	
}