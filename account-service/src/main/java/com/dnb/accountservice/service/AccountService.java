package com.dnb.accountservice.service;

import java.util.List;
import java.util.Optional;

import com.dnb.accountservice.dto.Account;
import com.dnb.accountservice.exception.IdNotFoundException;

public interface AccountService {

	public Account createAccount(Account account) throws IdNotFoundException;

	public Optional<Account> getAccountById(String accountId);

	public Iterable<Account> getAllAccounts();

	public boolean deleteAccountByID(String accountId) throws IdNotFoundException;

	public boolean checkAccountId(String accountId);

//	public boolean deleteAccountByID1(String contactNumber)throws IdNotFoundException;
//	public boolean checkNumber(String contactNumber);
//	public Optional<Account> getAccountByContactNumber(String contactNumber);
	public List<Account> getAccountByContactNumber(String contactNumber);

}