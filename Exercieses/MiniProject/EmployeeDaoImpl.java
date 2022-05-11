package com.revature;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    Connection connection;


    public EmployeeDaoImpl() {
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public void addEmployee(Employee employee) throws SQLException {
        String sql = "INSERT INTO employee(name, email) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getEmail());
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Employee saved");
        } else {
            System.out.println("Oops! Something went wrong!");
        }
    }

    @Override
    public void updateEmployee(Employee employee) throws SQLException {
        String sql = "update employee set name = ?, email = ? where id =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getEmail());
        preparedStatement.setInt(3, employee.getId());
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Employee updated");
        } else {
            System.out.println("Oops! Something went wrong!");
        }
    }

    @Override
    public void deleteEmployee(int id) throws SQLException {
        String sql = ("Delete from employee where id =?");
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //Statement stmt = connection.createStatement();
        preparedStatement.setInt(1, id);
        int rows = preparedStatement.executeUpdate();
        if (rows == 0) {
            System.out.println("Oops! You made a mistake!");
        } else {
            System.out.println("Deleted");
        }

    }

    @Override
    public List<Employee> getEmployee() throws SQLException {
        List<Employee> employeeList = new ArrayList<>();
        System.out.print("See all the employees: ");
        String sql = "select * from employee";
        Statement statement = connection.createStatement();
        ResultSet resultset = statement.executeQuery(sql);
        while (resultset.next()) {  // Repeatedly process each row
            int id = resultset.getInt(1); // grab id, grab email, make into employee object into list
            String name = resultset.getString("name");
            String email = resultset.getString("email");
            employeeList.add(new Employee(id, name, email));
// result set has all columns
            //getEmployee(resultset.getInt(1)).setId();
        }
        return employeeList;
    }

    @Override
    public Employee getEmployeeById(int id) throws SQLException {
        String sql = "Select *from employee where ID = " + id;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        if (resultSet != null) {
            id = resultSet.getInt(1);
            // get everything
            // object sending back;
            // going to the first one
        }

           return null;
        }



}