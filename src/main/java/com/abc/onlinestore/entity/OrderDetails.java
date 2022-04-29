package com.abc.onlinestore.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "orderId")
	private int orderId;
	@Column(nullable=false)
	private int deviceId;
	@Column(nullable=false)
	private int userId;
	@Column(nullable=false)
	private LocalDate orderDate;
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetails(int orderId, int deviceId, int userId, LocalDate orderDate) {
		super();
		this.orderId = orderId;
		this.deviceId = deviceId;
		this.userId = userId;
		this.orderDate = orderDate;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(deviceId, orderDate, orderId, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDetails other = (OrderDetails) obj;
		return deviceId == other.deviceId && Objects.equals(orderDate, other.orderDate) && orderId == other.orderId
				&& userId == other.userId;
	}
	
	
}