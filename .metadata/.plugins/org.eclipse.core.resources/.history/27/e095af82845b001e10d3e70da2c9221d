package com.dnb.customerservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnb.customerservice.dto.Customer;
import com.dnb.customerservice.exception.IdNotFoundException;
import com.dnb.customerservice.repo.CustomerRepository;
@Service("CustomerServiceImpl")
public class CustomerServiceImpl implements CustomerService {

@Autowired
//@Qualifier("AccountRepo2Impl")
CustomerRepository customerRepository;
@Override
public Customer createCustomer(Customer customer) {
	return customerRepository.save(customer);

}

public Optional<Customer> getCustomerById(Integer CustomerId) {
	// TODO Auto-generated method stub
	return customerRepository.findById(CustomerId);
	
}

public boolean deleteAccountByID(Integer CustomerId) throws IdNotFoundException  {

	// TODO Auto-generated method stub

	boolean isPresent = customerRepository.existsById(CustomerId);
    System.out.println(isPresent);
	if(isPresent) {

//		customerRepository.deleteById(CustomerId);
     customerRepository.deleteById(CustomerId);
		
	}else {

		throw new IdNotFoundException("Id not Found");

	}

	if(customerRepository.existsById(CustomerId))

		return false;

	else

		return true;

	

}

@Override
public Iterable<Customer> getAllCustomers() {
	// TODO Auto-generated method stub
	return customerRepository.findAll();

}


@Override

public boolean checkCustomerId(int CustomerId) {

	if (customerRepository.existsById(CustomerId))

		return true;

	else

		return false;
}

}

