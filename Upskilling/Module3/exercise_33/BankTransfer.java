package Upskilling.Module3.exercise_33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BankTransfer {
    static final String URL = "jdbc:mysql://localhost:3306/bank";
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void transfer(int fromAcc, int toAcc, double amount) {

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

            con.setAutoCommit(false);

            PreparedStatement debit = con.prepareStatement(
                    "UPDATE accounts SET balance=balance-? WHERE id=?");
            debit.setDouble(1, amount);
            debit.setInt(2, fromAcc);
            debit.executeUpdate();

            PreparedStatement credit = con.prepareStatement(
                    "UPDATE accounts SET balance=balance+? WHERE id=?");
            credit.setDouble(1, amount);
            credit.setInt(2, toAcc);
            credit.executeUpdate();

            con.commit();
            System.out.println("Transaction Successful");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        transfer(1, 2, 500);
    }
}
