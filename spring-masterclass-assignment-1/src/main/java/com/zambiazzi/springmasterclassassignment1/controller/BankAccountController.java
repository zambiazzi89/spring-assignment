package com.zambiazzi.springmasterclassassignment1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.zambiazzi.springmasterclassassignment1.service.BankAccountService;

@Controller
public class BankAccountController {

	@Autowired
	BankAccountService bankAccountService;

	public double withdraw(long accountId, double balance) {
		return bankAccountService.withdraw(accountId, balance);
	}

	public double deposit(long accountId, double balance) {
		return bankAccountService.deposit(accountId, balance);
	};

	public double getBalance(long accountId) {
		return bankAccountService.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		return bankAccountService.fundTransfer(fromAccount, toAccount, amount);
	}
}
