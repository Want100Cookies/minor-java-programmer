package com.want100cookies;

import java.sql.*;

public class Application {
    public static void main(String... args) {
        try {
            new Application().run();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.exit(0);
    }

    public void run() throws Exception {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptopshop?user=dbuser&password=dbpassword&verifyServerCertificate=false&useSSL=true");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT name, base_price FROM Laptops");

        while (resultSet.next()) {
            String str = String.format("Row: %s, %f", resultSet.getString("name"), resultSet.getFloat("base_price"));
            System.out.println(str);
        }

        resultSet.close();
        connection.close();
    }
}
