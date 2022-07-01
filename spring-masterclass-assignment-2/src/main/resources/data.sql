CREATE TABLE employees (
    employee_id INTEGER NOT NULL,
	employee_name VARCHAR(255) NOT NULL,
	employee_department VARCHAR(255) NOT NULL,
	employee_designation VARCHAR(255) NOT NULL,
	employee_salary DECIMAL(8, 2) NOT NULL,
	PRIMARY KEY(employee_id)
);

INSERT INTO employees VALUES (10001, 'Diego B Z', 'C&CA', 'Test Designation', 100000);

INSERT INTO employees VALUES (10002, 'John Doe', 'IT', 'Designation 2', 50000);