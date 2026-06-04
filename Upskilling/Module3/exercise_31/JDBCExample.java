package Upskilling.Module3.exercise_31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "root"; // replace with your MySQL password

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Database Connected Successfully!");

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute SELECT Query
            String query = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(query);

            // Display Records
            System.out.println("\nStudent Records:");
            System.out.println("ID\tName\tAge");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + "\t" + name + "\t" + age);
            }

            // Close Resources
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}