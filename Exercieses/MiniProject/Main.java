package com.revature;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws SQLException {

        // }Throwable e) throws SQLException {
        // Employee Dao
        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while (flag) {

            System.out.println("**************************************");
            System.out.println("Please select an option");

            System.out.println("**************************************");
            System.out.println("Press Option 1: to Add Employee");
            System.out.println("Press Option 2: to Update Employee");
            System.out.println("Press Option 3: to Delete Employee");
            System.out.println("Press Option 4: to Get All Employee");
            System.out.println("Press Option 5: to Get Employee ID");
            System.out.println("Press Option 6: to Exit");
            System.out.println("**************************************");


            int input = scanner.nextInt();
            // switch statement for the option above
            switch (input) {
                case 1: {
                    // to add employee
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Email: ");
                    String email = scanner.next();
                    Employee newEmployee = new Employee();
                    newEmployee.setName(name);
                    newEmployee.setEmail(email);
                    dao.addEmployee(newEmployee);
                    break;
                }
                case 2: {
                    // to update employee
                    System.out.print("Enter the ID of employee to update: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter the Name: ");
                    String name1 = scanner.next();
                    System.out.print("Enter the Email: ");
                    String email1 = scanner.next();
                    Employee employee = new Employee(id, name1, email1); // Employee object
                    dao.updateEmployee(employee);
                    break;
                }
                case 3: {
                    // to delete
                    System.out.println("Enter the ID you want to delete:  ");
                    int id = scanner.nextInt();
                    dao.deleteEmployee(id);
                    break;
                }
                case 4: {
                    // get all
                    List<Employee> employees = dao.getEmployee();
                    for (Employee employee: employees)
                        System.out.println(employee.toString());

                    break;
                }


                case 5: {
                    // get employee id
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    //System.out.print("employee");
                    Employee employee = dao.getEmployeeById(id);
                    System.out.println(employee);
                    break;
                }
                case 6: {
                    // to exit
                    System.out.println("Thank you");
                    System.out.println("Exiting...");
                    flag = false;
                    break;
                }
                default:
                    System.out.println("Choose a number between 1-6");
            }
        }
    }
}
