package com.dnb.customerservice.utils;

import org.springframework.stereotype.Component;

import com.dnb.customerservice.dto.Customer;
import com.dnb.customerservice.payload.request.CustomerRequest;

@Component
public class RequestToEntityMapper {

	public Customer getCustomerEntityObject(CustomerRequest customerRequest) {

		Customer customer=new Customer();
		customer.setCustomerName(customerRequest.getCustomerName());
		customer.setCustomercontactNumber(customerRequest.getCustomercontactNumber());
		customer.setCustomeraddress(customerRequest.getCustomeraddress());
		customer.setCustomerPAN(customerRequest.getCustomerPAN());
		customer.setCustomerUUID(customerRequest.getCustomerUUID());
	    return customer;
	}
}
