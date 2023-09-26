package com.dnb.accountservice.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor // implicitly it creates args constructor
@NoArgsConstructor // implicitly it creates default constructor
public class Customer {
	private int CustomerId;
	private String CustomerName;
	private String CustomercontactNumber;
	private String Customeraddress;
	private String CustomerUUID;
	private String CustomerPAN;

}
