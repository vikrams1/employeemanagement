# Employee Management Project

This is a comprehensive employee management project built using Spring, PostgreSQL database, Thymeleaf, Hibernate, HTML, CSS, and JavaScript. The project provides a user-friendly interface for managing employee records and performing various administrative tasks.

![homepage-employee.png](https://i.postimg.cc/LskBFjtN/homepage-employee.png)

## Features

- **Employee CRUD Operations**: Perform Create, Read, Update, and Delete (CRUD) operations on employee records, allowing you to efficiently manage employee data like Employee Name, Employee Designation, Employee Description and Employee Picture.
- **User Authentication**: Secure login functionality is implemented to ensure that only authorized users can access and modify employee information.
- **Department and Designation Management**: Manage departments and designations within the organization, allowing for better organization and categorization of employees.
- **Responsive UI**: The user interface is designed to be responsive, providing a seamless experience across different devices and screen sizes.

### Authentication
The Employee Management Project utilizes Spring Security for user authentication and authorization. Spring Security is a powerful framework that provides robust authentication and authorization mechanisms for Java applications.

When you run the application at first it asks for signin, you can find and change the username and password at `config/SecurityConfig.java` file.

![spring-signin.png](https://i.postimg.cc/DfRgsfwQ/spring-signin.png)

### Add Employee
Using **`ADD EMPLOYEE`** you can add a new employee with the field of `Employee Name`, `Employee Designation`, `Employee Description` and `Employee Picture`.

![addemployee.png](https://i.postimg.cc/T3dFYJ7K/addemployee.png)

### UPDATE
Using the **`UPDATE`** button you can update the current employee data.

![updateemployee.png](https://i.postimg.cc/FHTqfk8D/updateemployee.png)

### DELETE
Using **`DELETE`** button we can delete the employee data, while deleting browser gives an alert to confirm the deletation process.

![delete-employee.png](https://i.postimg.cc/L6fVVdJc/delete-employee.png)

### VIEW EMPLOYEE
USING **`VIEW EMPLOYEE`** you can view the all the existing Employee data, by default its the home page of our project.

## Technology Stack

- **Spring**: The project is built using the Spring framework, which provides a robust and flexible architecture for developing enterprise-level applications.
- **PostgreSQL**: PostgreSQL is used as the database management system, ensuring reliable and efficient data storage and retrieval.
- **Thymeleaf**: Thymeleaf is used as the server-side Java template engine, enabling easy integration of dynamic content into HTML pages.
- **Hibernate**: Hibernate is employed as the Object-Relational Mapping (ORM) framework, allowing seamless interaction with the database and simplifying data manipulation.
- **HTML, CSS, and JavaScript**: The front end of the application is developed using HTML for structure, CSS for styling, and JavaScript for interactive functionality, resulting in a visually appealing and dynamic user interface.

## Getting Started

To set up the project locally, follow these steps:

1. Clone the repository: `git clone <https://github.com/sagarxt/employeemanagement.git>`
2. Configure the database connection settings in the application.properties file.
3. Build the project using `Maven`.
4. Run the application on a local server.
5. Access the application in your web browser.

Make sure you have the necessary dependencies installed and meet the system requirements as mentioned in the project documentation.

- **Java Development Kit (JDK):** Install the latest version of JDK to compile and run Java applications. You can download it from the Oracle website or adopt OpenJDK.

- **Integrated Development Environment (IDE):** You can choose any Java IDE of your preference. Popular options include Eclipse, IntelliJ IDEA, or Visual Studio Code. Make sure you have your IDE properly set up.

- **PostgreSQL Database:** Install the PostgreSQL database management system to create and manage the project's database. You can download it from the official PostgreSQL website. Make sure you have the necessary credentials (username, password, and database name) to access the database.

- **Web Browser:** You will need a modern web browser (such as Google Chrome, Mozilla Firefox, or Microsoft Edge) to access and interact with the project's user interface.

## Contributions

Contributions to the project are welcome! If you encounter any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

Please ensure that you follow the project's code of conduct and provide detailed information about the changes you propose.

## Contact

For any questions or inquiries, please contact the project maintainer at `mrsagarxt@gmail.com`.
