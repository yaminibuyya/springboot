package com.ciq.BEAN;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Address {
	
	@NotBlank(message = "Stree must be have a value")
	private String street;
	
	@Size(message = "State must be have a value with size 2")
	private String state;
	
	@NotNull(message = "Zip code is requried")
	private int pincode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String state, int pincode) {
		super();
		this.street = street;
		this.state = state;
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", state=" + state + ", pincode=" + pincode + "]";
	}
	

}
