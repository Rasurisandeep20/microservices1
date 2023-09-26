package com.dnb.customerservice.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dnb.customerservice.dto.Customer;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

//	public Customer createCustomer(Customer customer);
//	
//	public Optional<Customer> getCustomerById(int customerId);
//	
//
//	
//	public List<Customer> getAllCustomers();
//
//	public boolean deleteAccountById(String customerId);
	
	

}