# simple-CRM
A simple application to manage customer, salesmen, and product (machine) relationships. The database contains information about customers, salesmen, users,
and potential transactions. The application has user registration and login handling with Spring Security. There is one simple view in the application to handle the function of calculating potential sales.

# Usage
The application has one functionality, it can count the amount of profit from all busines opportunitys of the selected salesman.  
After entering the endpoint http://domain/salesman/potential a selection list of all salesmen from our database is displayed.
Then, after making a selection, we are shown the sum of potential sales of the given salesman.

# Technologies
- Java
- Spring Boot
- Spring Security
- Hibernate
- JSTL and JSP
- JPA and a bit of JPQL