package org.example;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.xml.transform.Result;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class App extends Application implements Initializable {

    private static int width = 460;
    private static int height = 729;
    private static Scene weight;
    private Stage mainWindow;
    private static Scene scene;
    private String variable = "";
    private double variable_two = 0;
    private String selected_operation;
    @FXML
    private TextField screen;

    private final double pi = 3.14159265359;
    private double ans = 0;
    private boolean wasPressed = false;

    public void wasPressedCheck(){
        if(wasPressed){
            screen.setText("");
            variable = "";
            wasPressed = false;
        }
    }


    @Override
    public void start(Stage stage) throws IOException{
        //FXMLLoader.load(getClass().getResource("PLACEHOLDER.fxml"))
        scene = new Scene(loadFXML("App"), width, height);
        weight = new Scene(loadFXML("Weight"), width, height);
        stage.setTitle("f(x)");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void one_pressed(ActionEvent actionEvent) {
        wasPressedCheck();
        variable += "1";
        screen.setText(String.valueOf(variable));
    }
    public void two_pressed(ActionEvent actionEvent) {
        wasPressedCheck();
        variable += "2";
        screen.setText(String.valueOf(variable));
    }
    public void three_pressed(ActionEvent actionEvent) {
        wasPressedCheck();
        variable += "3";
        screen.setText(String.valueOf(variable));
    }
    public void four_pressed(ActionEvent actionEvent) {
        wasPressedCheck();
        variable += "4";
        screen.setText(String.valueOf(variable));
    }
    public void five_pressed(ActionEvent actionEvent) {
        wasPressedCheck();
        variable += "5";
        screen.setText(String.valueOf(variable));
    }
    public void six_pressed(ActionEvent actionEvent) {
        wasPressedCheck();
        variable += "6";
        screen.setText(String.valueOf(variable));
    }
    public void seven_pressed(ActionEvent actionEvent) {
        wasPressedCheck();
        variable += "7";
        screen.setText(String.valueOf(variable));
    }
    public void eight_pressed(ActionEvent actionEvent) {
        wasPressedCheck();
        variable += "8";
        screen.setText(String.valueOf(variable));
    }
    public void nine_pressed(ActionEvent actionEvent) {
        wasPressedCheck();
        variable += "9";
        screen.setText(String.valueOf(variable));
    }
    public void zero_pressed(ActionEvent actionEvent) {
        wasPressedCheck();
        variable += "0";
        screen.setText(String.valueOf(variable));
    }

//cannot do operations if the number is negative, because converter cant handle that
    public void add_pressed(ActionEvent actionEvent) {
        variable_two = Double.parseDouble(variable);
        selected_operation = "add";
        variable = "";
    }
    public void sub_pressed(ActionEvent actionEvent) {
        variable_two = Double.parseDouble(variable);
        selected_operation = "sub";
        variable = "";
    }
     public void div_pressed(ActionEvent actionEvent) {
        //add zero division exception
            variable_two = Double.parseDouble(variable);
            selected_operation = "div";
            variable = "";
    }
     public void times_pressed(ActionEvent actionEvent) {
        variable_two = Double.parseDouble(variable);
        selected_operation = "times";
        variable = "";
    }


     public void clr_pressed(ActionEvent actionEvent) {
        variable = "";
        variable_two = 0;
        screen.setText(variable);
    }


     public void pi_pressed(ActionEvent actionEvent) {
        variable = String.valueOf(pi);
        screen.setText(variable);
    }
//Double.parseDouble()
//Integer.parseInt()
//String.valueOf()
     public void superscript_pressed(ActionEvent actionEvent) {
            DBController.insert(variable_two, Double.parseDouble(variable),"Power");
            double temp = 0;
            temp = Double.parseDouble(variable)*Double.parseDouble(variable);
            variable = String.valueOf(temp);
            screen.setText(String.valueOf(variable));
    }


     public void sqrt_pressed(ActionEvent actionEvent) {
            DBController.insert(variable_two, Double.parseDouble(variable),"Sqrt");
            double  temp = 0;
            temp = Math.sqrt(Double.parseDouble(variable));
            variable = String.valueOf(temp);
            screen.setText(String.valueOf(variable));
    }

    public void equal_pressed(ActionEvent actionEvent){
        ResultClass object = new ResultClass(Double.parseDouble(variable), variable_two, selected_operation, 0);
        DBController.insert(variable_two, Double.parseDouble(variable), selected_operation);

        if(selected_operation == "add"){
            variable_two += Double.parseDouble(variable);
        }

         if(selected_operation == "sub"){
            variable_two -= Double.parseDouble(variable);
        }

          if(selected_operation == "div"){
              variable_two /= Double.parseDouble(variable);
        }

           if(selected_operation == "times") {
               variable_two *= Double.parseDouble(variable);

           }
            object.overrideValue(variable_two);
            //ResultClass.addToList(object);

            screen.setText(String.valueOf(variable_two));
            variable = String.valueOf(variable_two);
            ans = variable_two;
            variable_two = 0;
            wasPressed = true;
    }

    public void ans_pressed(ActionEvent actionEvent) {
            variable = String.valueOf(ans);
            screen.setText(String.valueOf(ans));
    }

    public void cos_pressed(ActionEvent actionEvent) {
        DBController.insert(variable_two, Double.parseDouble(variable),"Cos");
        variable = String.valueOf(Math.cos(Double.parseDouble(variable)));
            screen.setText(String.valueOf(variable));
            wasPressed = true;
    }

    public void sin_pressed(ActionEvent actionEvent) {
        DBController.insert(variable_two, Double.parseDouble(variable),"Sin");
        variable = String.valueOf(Math.sin(Double.parseDouble(variable)));
            screen.setText(String.valueOf(variable));
            wasPressed = true;
    }

    public void tan_pressed(ActionEvent actionEvent) {
        DBController.insert(variable_two, Double.parseDouble(variable),"Tan");
        variable = String.valueOf(Math.tan(Double.parseDouble(variable)));
            screen.setText(String.valueOf(variable));
            wasPressed = true;
    }


        public void weight_pressed(ActionEvent actionEvent) throws IOException {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Weight.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setResizable(false);
                stage.setTitle("f(x) - Range");
                stage.show();
        }

        public void temp_pressed(ActionEvent actionEvent) throws IOException {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Temp.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setResizable(false);
                stage.setTitle("f(x) - Temperature");
                stage.show();
        }

        public void curr_pressed(ActionEvent actionEvent) throws IOException {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Curr.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setResizable(false);
                stage.setTitle("f(x) - Currency");
                stage.show();
        }

        public void num_pressed(ActionEvent actionEvent) throws IOException {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Num.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setResizable(false);
                stage.setTitle("f(x) - Numbers");
                stage.show();
        }

        public void others_pressed(ActionEvent actionEvent) throws IOException{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Others.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setResizable(false);
                stage.setTitle("f(x) - Others");
                stage.show();
        }

        public void decimal_point_pressed(ActionEvent actionEvent){
            if(!screen.getText().contains(".")){
                variable += ".";
                screen.setText(variable);
            }
        }





    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DBController.connect();
    }
}