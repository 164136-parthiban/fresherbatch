package com.parthi.parking;

public class ParkedCarOwnerDetails 
{

	String ownerName,carModel;
	String ownerAddress;
	String carNo;
	String ownerMobileNo;
	
	public ParkedCarOwnerDetails(String ownerName, String carModel, String ownerAddress, String carNo,
			String ownerMobileNo) {
		
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.ownerAddress = ownerAddress;
		this.carNo = carNo;
		this.ownerMobileNo =  ownerMobileNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getOwnerMobileNo() {
		return ownerMobileNo;
	}

	public void setOwnerMobileNo(String ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}
	
	
	
	
}
