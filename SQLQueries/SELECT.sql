/*Insert the missing statement to get all the columns from the Customers table. */

SELECT * FROM Customers;

/*Write a statement that will select the City column from the Customers table. */

SELECT City FROM Customers;

/* Select all the different values from the Country column in the Customers table. */

SELECT DISTINCT Country FROM Customers;

/*Select all records where the City column has the value "Berlin". */

SELECT * FROM Customers WHERE City= 'Berlin';

/*Select all records where the CustomerID column has the value 32. */

SELECT * FROM Customers WHERE CustomerID = 32;
