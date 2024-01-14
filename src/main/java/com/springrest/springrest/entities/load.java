package com.springrest.springrest.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class load {
	
	
	@Id
	private String loadingPoint;
	private String UnloadingPoint;
	private String productType;
	private String truckType;
	private String noOfTrucks;
	private String Weight;
	private long shipperId;
	private String Date;
	public load(String loadingPoint, String unloadingPoint, String productType, String truckType, String noOfTrucks,
			String weight, long shipperId, String date) {
		super();
		this.loadingPoint = loadingPoint;
		UnloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		Weight = weight;
		this.shipperId = shipperId;
		Date = date;
	}
	public load() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return UnloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		UnloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public String getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(String noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public String getWeight() {
		return Weight;
	}
	public void setWeight(String weight) {
		Weight = weight;
	}
	public long getShipperId() {
		return shipperId;
	}
	public void setShipperId(long shipperId) {
		this.shipperId = shipperId;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		this.Date = date;
	}
	@Override
	public String toString() {
		return "load [loadingPoint=" + loadingPoint + ", UnloadingPoint=" + UnloadingPoint + ", productType="
				+ productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks + ", Weight=" + Weight
				+ ", shipperId=" + shipperId + ", Date=" + Date + ", getLoadingPoint()=" + getLoadingPoint()
				+ ", getUnloadingPoint()=" + getUnloadingPoint() + ", getProductType()=" + getProductType()
				+ ", getTruckType()=" + getTruckType() + ", getNoOfTrucks()=" + getNoOfTrucks() + ", getWeight()="
				+ getWeight() + ", getShipperId()=" + getShipperId() + ", getDate()=" + getDate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
