package com.dnb.customerservice.service;

import java.util.Optional;

import com.dnb.customerservice.dto.Customer;
import com.dnb.customerservice.exception.IdNotFoundException;

public interface CustomerService {
	public Customer createCustomer(Customer customer) throws IdNotFoundException;

	public Optional<Customer> getCustomerById(Integer CustomerId);

	// public String deleteAccount(Integer CustomerId);
	public Iterable<Customer> getAllCustomers();

	public boolean deleteAccountByID(Integer id) throws IdNotFoundException;

	public boolean checkCustomerId(int CustomerId);
}