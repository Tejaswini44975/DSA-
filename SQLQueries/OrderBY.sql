/* Select all records from the Customers table, sort the result alphabetically by the column City. */

SELECT * FROM Customers ORDER BY City;

/* Select all records from the Customers table, sort the result reversed alphabetically by the column City. */

SELECT * FROM Customers ORDER BY City DESC;

/* Select all records from the Customers table, sort the result alphabetically, first by the column Country, then, by the column City. */

SELECT * FROM Customers ORDER BY Country,City;

/* Select all records where the City column has the value 'Berlin' and the PostalCode column has the value '12209'.  */

SELECT * FROM Customers WHERE City = 'Berlin' AND PostalCode = '12209';
