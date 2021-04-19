package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ResultClass implements Initializable {
    private static double FirstNumber;
    private static double SecondNumber;
    private static String Operation;
    private static Double Result;

    public static double getFirstNumber() {
        return FirstNumber;
    }

    public static void setFirstNumber(double firstNumber) {
        FirstNumber = firstNumber;
    }

    public static double getSecondNumber() {
        return SecondNumber;
    }

    public static void setSecondNumber(double secondNumber) {
        SecondNumber = secondNumber;
    }

    public static String getOperation() {
        return Operation;
    }

    public static void setOperation(String operation) {
        Operation = operation;
    }

    public static Double getResult() {
        return Result;
    }

    public static void setResult(Double result) {
        Result = result;
    }

    public static List<ResultClass> getHolder() {
        return holder;
    }

    public static void setHolder(List<ResultClass> holder) {
        ResultClass.holder = holder;
    }

    private static List<ResultClass> holder;
    //private static ObservableList<ResultClass> data;

        ResultClass(double fn, double sn, String op, double rs){
            FirstNumber = fn;
            SecondNumber = sn;
            Operation = op;
            Result = rs;
        }

    public static void overrideValue(double value){

            Result = value;
    }
    public static List<ResultClass> getAllInstance(){

            return holder;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //ObservableList<ResultClass> data = FXCollections.observableArrayList();
        // List<ResultClass> holder = FXCollections.observableArrayList();
    }
}
