package Upskilling.Module3.exercise_32;

import java.sql.*;

public class StudentDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/college";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public void insertStudent(int id, String name, int age) {
        String query = "INSERT INTO students VALUES (?, ?, ?)";

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setInt(3, age);

            pst.executeUpdate();
            System.out.println("Student inserted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int id, String newName) {
        String query = "UPDATE students SET name=? WHERE id=?";

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, newName);
            pst.setInt(2, id);

            pst.executeUpdate();
            System.out.println("Student updated successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        dao.insertStudent(4, "Aman", 21);
        dao.updateStudent(4, "Aman Sharma");
    }
}