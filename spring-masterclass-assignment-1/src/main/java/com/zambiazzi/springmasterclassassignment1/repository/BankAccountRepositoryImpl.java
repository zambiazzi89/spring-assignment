package com.zambiazzi.springmasterclassassignment1.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.zambiazzi.springmasterclassassignment1.model.BankAccount;

@Repository
@Transactional
public class BankAccountRepositoryImpl implements BankAccountRepository {

	// Connect to the database
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public double getBalance(long accountId) {
		return entityManager.find(BankAccount.class, accountId).getAccountBalance();
	}

	/**
	 * @return new balance
	 */
	@Override
	public double updateBalance(long accountId, double newBalance) {
		entityManager.find(BankAccount.class, accountId).setAccountBalance(newBalance);
		return getBalance(accountId);
	}

}
