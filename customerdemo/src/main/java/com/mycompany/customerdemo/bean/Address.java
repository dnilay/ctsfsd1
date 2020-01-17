package com.mycompany.customerdemo.bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Address {
	private String addressLine1;
	private String addressLine2;
	private String phoneNumber;
	private String zipCode;
	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", phoneNumber="
				+ phoneNumber + ", zipCode=" + zipCode + "]";
	}
	
	

}
