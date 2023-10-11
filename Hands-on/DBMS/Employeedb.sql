/*creating database Employeedb */
create database Employeedb;

/*use Employeedb*/
use Employeedb;

/*Creating table employee*/
CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    job_name VARCHAR(50),
    manager_id INT,
    hire_date DATE,
    salary DECIMAL(10, 2),
    commission DECIMAL(10, 2),
    dep_id INT
);

/*Describing the employee table*/
desc employee;

/*Inserting the employee data in employee table*/
insert into employee values(68319, 'KAYLING', 'PRESIDENT', NULL, '1991-11-18', 6000.00, NULL, 1001);
insert into employee values(66928, 'BLAZE', 'MANAGER', 68319, '1991-05-01', 2750.00, NULL, 3001);
insert into employee values(67832, 'CLARE', 'MANAGER', 68319, '1991-06-09', 2550.00, NULL, 1001);
insert into employee values(65646, 'JONAS', 'MANAGER', 68319, '1991-04-02', 2957.00, NULL, 2001);
insert into employee values(67858, 'SCARLET', 'ANALYST', 65646, '1997-04-19', 3100.00, NULL, 2001);
insert into employee values(69062, 'FRANK', 'ANALYST', 65646, '1991-12-03', 3100.00, NULL, 2001);
insert into employee values(63679, 'SANDRINE', 'CLERK', 69062, '1990-12-18', 900.00, NULL, 2001);
insert into employee values(64989, 'ADELYN', 'SALESMAN', 66928, '1991-02-20', 1700.00, 400.00, 3001);
insert into employee values(65271, 'WADE', 'SALESMAN', 66928, '1991-02-22', 1350.00, 600.00, 3001);
insert into employee values(66564, 'MADDEN', 'SALESMAN', 66928, '1991-09-28', 1350.00, 1500.00, 3001);
insert into employee values(68454, 'TUCKER', 'SALESMAN', 66928, '1991-09-08', 1600.00, 0.00, 3001);
insert into employee values(68736, 'ADNRES', 'CLERK', 67858, '1997-05-23', 1200.00, NULL, 2001);
insert into employee values(69000, 'JULIUS', 'CLERK', 66928, '1991-12-03', 1050.00, NULL, 3001);
insert into employee values(69324, 'MARKER', 'CLERK', 67832, '1992-01-23', 1400.00, NULL, 1001);

/*1. From the following table return complete information about the employees.*/
select * from employee;

/*From the following table, write a SQL query to find the salaries of all employees. Return salary.*/
select salary from employee;

/*From the following table, write a SQL query to find the unique designations of the employees. Return job name.*/
SELECT DISTINCT job_name FROM employee;

/*4.From the following table, write a SQL query to list the employees’ name, increased their salary by 15%, and expressed as number of Dollars.*/
SELECT emp_name,
       salary * 1.15 AS increased_salary_in_dollars
FROM employee;

/*From the following table, write a SQL query to list the employee's name and job name as a format of "Employee & Job".*/
SELECT CONCAT(emp_name, ' & ', job_name) AS employee_and_job
FROM employee;

/*6.Write a query in SQL to produce the output of employees as follows.
Employee*/
SELECT emp_name AS "Employee"
FROM employee;

/*7.From the following table, write a SQL query to find those employees with hire date in the format like February 22, 1991. Return employee ID, employee name, salary, hire date.*/
SELECT emp_id,
       emp_name,
       salary,
       DATE_FORMAT(hire_date, '%M %d, %Y') AS formatted_hire_date
FROM employee;

/*8.From the following table, write a SQL query to count the number of characters except the spaces for each employee name. Return employee name length.*/
SELECT emp_name,
       LENGTH(REPLACE(emp_name, ' ', '')) AS name_length
FROM employee;

/*9.From the following table, write a SQL query to find the employee ID, salary, and commission of all the employees.*/
select  emp_id, salary, commission from employee;

/*10.From the following table, write a SQL query to find the unique department with jobs. Return department ID, Job name.*/
SELECT DISTINCT dep_id, job_name
FROM employee;

/*11.From the following table, write a SQL query to find those employees who do not belong to the department 2001. Return complete information about the employees.*/
SELECT * FROM employee WHERE dep_id NOT IN (2001);

/*12.From the following table, write a SQL query to find those employees who joined before 1991. Return complete information about the employees.*/
select * from employee where hire_date<(1991-01-01);

/*13.From the following table, write a SQL query to calculate the average salary of employees who work as analysts. Return average salary.*/
select avg(salary) from employee where job_name='ANALYST';

/*14.From the following table, write a SQL query to find the details of the employee ‘BLAZE’.*/
select * from employee where emp_name='BLAZE';

/*15.From the following table, write a SQL query to identify employees whose commissions exceed their salaries. Return complete information about the employees.*/
select * from employee where (commission > salary);

/*16.From the following table, write a SQL query to identify those employees whose salaries exceed 3000 after receiving a 25% salary increase. Return complete information about the employees.*/
select * from employee where(1.25*salary)>3000;

/*17.From the following table, write a SQL query to find the names of the employees whose length is six. Return employee name.*/
select emp_name from employee where length(emp_name)=6;

/*18.From the following table, write a SQL query to find out which employees joined in the month of January. Return complete information about the employees.*/
select * from employee where month(hire_date)=1;

/*19.From the following table, write a SQL query to separate the names of employees and their managers by the string 'works for'.*/
SELECT CONCAT(e1.emp_name, ' works for ', e2.emp_name) AS relationship
FROM employee e1
JOIN employee e2 ON e1.manager_id = e2.emp_id;

/*20.From the following table, write a SQL query to find those employees whose designation is ‘CLERK’. Return complete information about the employees.*/
select * from employee where job_name='CLERK';

