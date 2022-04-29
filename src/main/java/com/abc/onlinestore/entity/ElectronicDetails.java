package com.abc.onlinestore.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ElectronicDetails implements Comparable<ElectronicDetails>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deviceId;
	private String deviceName;
	private String deviceType;
	private int cost;
	private int rating;
	private int offers;
	public ElectronicDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ElectronicDetails(int deviceId, String deviceName, String deviceType, int cost, int rating, int offers) {
		super();
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.deviceType = deviceType;
		this.cost = cost;
		this.rating = rating;
		this.offers = offers;
	}
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getOffers() {
		return offers;
	}
	public void setOffers(int offers) {
		this.offers = offers;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cost, deviceId, deviceName, deviceType, offers, rating);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectronicDetails other = (ElectronicDetails) obj;
		return cost == other.cost && deviceId == other.deviceId && Objects.equals(deviceName, other.deviceName)
				&& Objects.equals(deviceType, other.deviceType) && offers == other.offers && rating == other.rating;
	}
	@Override
	public int compareTo(ElectronicDetails o) {
		// TODO Auto-generated method stub
		return this.deviceId-o.deviceId;
	}
	
	
	
}