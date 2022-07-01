package com.zambiazzi.springmasterclassassignment1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zambiazzi.springmasterclassassignment1.repository.BankAccountRepository;

@Service
public class BankAccountServiceImpl implements BankAccountService {

	@Autowired
	BankAccountRepository bankAccountRepository;

	/**
	 * Avoid floating-point error by multiplying and dividing by 100
	 * 
	 * @param balance is the value to be withdrawn
	 * @return new balance
	 */
	@Override
	public double withdraw(long accountId, double balance) {
		return bankAccountRepository.updateBalance(accountId, (getBalance(accountId) * 100 - balance * 100) / 100);
	}

	/**
	 * Avoid floating-point error by multiplying and dividing by 100
	 * 
	 * @param balance is the value to be deposited
	 * @return new balance
	 */
	@Override
	public double deposit(long accountId, double balance) {
		return bankAccountRepository.updateBalance(accountId, (getBalance(accountId) * 100 + balance * 100) / 100);
	}

	@Override
	public double getBalance(long accountId) {
		return bankAccountRepository.getBalance(accountId);
	}

	/**
	 * @param fromAccount and toAccount are accountIds
	 * @return if transaction was successful
	 */
	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		// TODO implement false scenarios
		withdraw(fromAccount, amount);
		deposit(toAccount, amount);
		return true;
	}

}
