package org.example;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class DBController {
    public static Connection connect() {
        Connection con = null;
        try {
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:CalculatorDB.db";
            //DriverManager.registerDriver(new org.sqlite.JDBC());
            con = DriverManager.getConnection(dbURL);
            System.out.println("Connected to the database!");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    static void insert(double num1, double num2, String op){
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            Connection con = connect();
            System.out.println("Input.: " + String.valueOf(num1) + " " + String.valueOf(num2) + " " + op);
            String query = "INSERT INTO CalculatorDB(FirstNumber, SecondNumber, Operation) VALUES (?,?,?)";
            //String query = "SELECT * FROM DB WHERE Name = ? and ID = ?";
            if (con != null) {
                System.out.println("Insert started!");
                ps = con.prepareStatement(query);
                ps.setDouble(1, num1);
                ps.setDouble(2, num2);
                ps.setString(3, op);
                ps.execute();
            } else {
                System.out.println("Nullpoint Exception Error!");
            }
            System.out.println("Query has run successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static ObservableList<ResultClass> getResults(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ObservableList<ResultClass> data = FXCollections.observableArrayList();
        try{
            Connection con = connect();
            String query = "SELECT * FROM CalculatorDB";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                /*
                System.out.println(rs.getString("FirstNumber") + " " +
                        rs.getString("SecondNumber") + " " +
                        rs.getString("Operation"));
                */

                ResultClass rc = new ResultClass(Double.parseDouble(rs.getString("FirstNumber")),
                        Double.parseDouble(rs.getString("SecondNumber")),
                        rs.getString("Operation"),
                        0.0);//needs to be calculated later

                System.out.println(ResultClass.getFirstNumber() + " | " +
                        ResultClass.getSecondNumber() + " | " +
                        ResultClass.getSecondNumber() + " | " +
                        ResultClass.getResult() + " | " +
                        ResultClass.getOperation());

                data.add(rc);
            }
            if (con != null) {
                System.out.println("Query started!");
                ps = con.prepareStatement(query);
                ps.executeQuery();
            } else {
                System.out.println("Nullpoint Exception Error!");
            }
            System.out.println("Query has run successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }







}




