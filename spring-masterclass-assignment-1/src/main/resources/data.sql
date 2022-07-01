CREATE TABLE bank_accounts (
    account_id INTEGER NOT NULL,
	account_holder_name VARCHAR(255) NOT NULL,
	account_type VARCHAR(255) NOT NULL,
	account_balance DECIMAL(6, 2) NOT NULL,
	PRIMARY KEY(account_id)
);

INSERT INTO bank_accounts VALUES (10001, 'Diego B Z', 'Checking', 2.50);

INSERT INTO bank_accounts VALUES (10002, 'John Doe', 'Savings', 0.0);