package com.dnb.customerservice.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // implicitly it creates args constructor
@NoArgsConstructor // implicitly it creates default constructor
@Entity
public class Customer {
	@Id
	@Column
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CustomerId;
	private String CustomerName;
	private String CustomercontactNumber;
	private String Customeraddress;
	private String CustomerUUID;
	private String CustomerPAN;
//one customer can have multiple accounts
//	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="customer")//if we uses eager whenever we wants to retrieve customer details it also gives account details
	//@JsonIgnore
	//("account")
//	@JsonIgnoreProperties("customer")

//	private List<Account> accountList = new ArrayList<>();
}
