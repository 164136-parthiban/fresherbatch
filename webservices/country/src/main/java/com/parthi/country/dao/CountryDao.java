package com.parthi.country.dao;

public class CountryDao
{
	
	String state, city,countryName;
	long zipCode;
	
	
	public CountryDao(String state, String city, String countryName, long zipCode) {
		super();
		this.state = state;
		this.city = city;
		this.countryName = countryName;
		this.zipCode = zipCode;
	}
	
	public CountryDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public long getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "CountryDao [state=" + state + ", city=" + city + ", countryName=" + countryName + ", zipCode=" + zipCode
				+ "]";
	}
	
	

}
