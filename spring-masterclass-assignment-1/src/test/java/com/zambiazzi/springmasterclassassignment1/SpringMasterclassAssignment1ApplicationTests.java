package com.zambiazzi.springmasterclassassignment1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.zambiazzi.springmasterclassassignment1.controller.BankAccountController;

@SpringBootTest
class SpringMasterclassAssignment1ApplicationTests {

	@Autowired
	BankAccountController bankAccountController;

	@Test
	void getBalanceTest() {
	}

	@Test
	void withdrawTest() {
	}

	@Test
	void depositTest() {
	}

	@Test
	void transferTest() {
		assertEquals(2.5, bankAccountController.getBalance(10001));
		assertEquals(1.9, bankAccountController.withdraw(10001, 0.6));
		assertEquals(2.6, bankAccountController.deposit(10001, 0.7));
		assertEquals(true, bankAccountController.fundTransfer(10001, 10002, 1.6));
	}
}
