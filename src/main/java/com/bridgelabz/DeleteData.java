package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

    public class DeleteData {
        public static void main(String[] args) {
            String query = "DELETE FROM employee_payroll WHERE name='ram'";
            Connection connection = null;
            Statement statement = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("Driver class loaded and registered");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service? user=root & password=root");
                System.out.println("Connection established with db server");
                statement = connection.createStatement();
                System.out.println("platform created/statement object created");
                statement.executeUpdate(query);
                System.out.println("Data deleted from DB");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

    }

