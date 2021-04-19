package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Weight implements Initializable {
    @FXML
    private TextField range_textfield;
    @FXML
    private TextField from_field;
    @FXML
    private TextField to_field;
    @FXML
    private Spinner<String> from_spinner;
    @FXML
    private Spinner<String> to_spinner;
    @FXML
    private Button swap_button;
    @FXML
    private Button convert_button;

    String swap;
    String metrical_get_value;
    String imperial_get_value;

    double converted_value = 0;




    ObservableList<String> metrical_values = FXCollections.observableArrayList("millimeter", "centimeter", "meter", "kilometer");
    SpinnerValueFactory<String> metrical = new SpinnerValueFactory.ListSpinnerValueFactory(metrical_values);


    ObservableList<String> imperial_values = FXCollections.observableArrayList("inch", "feet", "yard", "mile");
    SpinnerValueFactory<String> imperial = new SpinnerValueFactory.ListSpinnerValueFactory(imperial_values);



    public void convert_pushed(ActionEvent actionEvent) {
        metrical_get_value = from_field.getText();
        imperial_get_value = to_field.getText();

        if( from_field.getText().isEmpty() && !to_field.getText().isEmpty()
                ||
            !from_field.getText().isEmpty() && to_field.getText().isEmpty()
        ){

            //IMPERIAL CONVERSIONS
            if(from_field.getText().isEmpty() && !to_field.getText().isEmpty()){
                //inch -> %
                if (imperial.getValue() == "inch" && metrical.getValue() == "millimeter") {
                    converted_value = Double.parseDouble(imperial_get_value) * 25.4;
                }


                if (imperial.getValue() == "inch" && metrical.getValue() == "centimeter") {
                    converted_value = Double.parseDouble(imperial_get_value) * 2.54;
                }

                if (imperial.getValue() == "inch" && metrical.getValue() == "meter") {
                    converted_value = Double.parseDouble(imperial_get_value) * 0.0254;
                }

                if (imperial.getValue() == "inch" && metrical.getValue() == "kilometer") {
                    converted_value = Double.parseDouble(imperial_get_value) * 0.0000254;
                }


                //feet -> %
                if (imperial.getValue() == "feet" && metrical.getValue() == "millimeter") {
                    converted_value = Double.parseDouble(imperial_get_value) * 304.8;
                }


                if (imperial.getValue() == "feet" && metrical.getValue() == "centimeter") {
                    converted_value = Double.parseDouble(imperial_get_value) * 30.48;
                }

                if (imperial.getValue() == "feet" && metrical.getValue() == "meter") {
                    converted_value = Double.parseDouble(imperial_get_value) * 0.3048;
                }

                if (imperial.getValue() == "feet" && metrical.getValue() == "kilometer") {
                    converted_value = Double.parseDouble(imperial_get_value) * 0.0003048;
                }

                //yard -> %metrical
                if (imperial.getValue() == "yard" && metrical.getValue() == "millimeter") {
                    converted_value = Double.parseDouble(imperial_get_value) * 914.4;
                }


                if (imperial.getValue() == "yard" && metrical.getValue() == "centimeter") {
                    converted_value = Double.parseDouble(imperial_get_value) * 91.44;
                }

                if (imperial.getValue() == "yard" && metrical.getValue() == "meter") {
                    converted_value = Double.parseDouble(imperial_get_value) * 0.9144;
                }

                if (imperial.getValue() == "yard" && metrical.getValue() == "kilometer") {
                    converted_value = Double.parseDouble(imperial_get_value) * 0.0009144;
                }


                //mile -> %
                if (imperial.getValue() == "mile" && metrical.getValue() == "millimeter") {
                    converted_value = Double.parseDouble(imperial_get_value) * 1609344;
                }


                if (imperial.getValue() == "mile" && metrical.getValue() == "centimeter") {
                    converted_value = Double.parseDouble(imperial_get_value) * 160934.4;
                }

                if (imperial.getValue() == "mile" && metrical.getValue() == "meter") {
                    converted_value = Double.parseDouble(imperial_get_value) * 1609.344;
                }

                if (imperial.getValue() == "mile" && metrical.getValue() == "kilometer") {
                    converted_value = Double.parseDouble(imperial_get_value) * 1.609344;
                }

                 range_textfield.setText(String.valueOf(converted_value));
            }















            //METRICAL CONVERSIONS
            if(!from_field.getText().isEmpty() && to_field.getText().isEmpty()){

                //mm -> %
                if (metrical.getValue() == "millimeter" && imperial.getValue() == "inch") {
                    converted_value = Double.parseDouble(metrical_get_value) * 0.0393700787;
                }


                if (metrical.getValue() == "millimeter" && imperial.getValue() == "feet") {
                    converted_value = Double.parseDouble(metrical_get_value) * 0.0032808399;
                }

                if (metrical.getValue() == "millimeter" && imperial.getValue() == "yard") {
                    converted_value = Double.parseDouble(metrical_get_value) * 0.0010936133;
                }

                if (metrical.getValue() == "millimeter" && imperial.getValue() == "mile") {
                    converted_value = Double.parseDouble(metrical_get_value) * 0.000000621371192;
                }


                //cm -> %
                if (metrical.getValue() == "centimeter" && imperial.getValue() == "inch") {
                    converted_value = Double.parseDouble(metrical_get_value) * 0.393700787;
                }


                if (metrical.getValue() == "centimeter" && imperial.getValue() == "feet") {
                    converted_value = Double.parseDouble(metrical_get_value) * 0.032808399;
                }

                if (metrical.getValue() == "centimeter" && imperial.getValue() == "yard") {
                    converted_value = Double.parseDouble(metrical_get_value) * 0.010936133;
                }

                if (metrical.getValue() == "centimeter" && imperial.getValue() == "mile") {
                    converted_value = Double.parseDouble(metrical_get_value) * 0.00000621371192;
                }

                //m -> %
                if (metrical.getValue() == "meter" && imperial.getValue() == "inch") {
                    converted_value = Double.parseDouble(metrical_get_value) * 39.3700787;
                }


                if (metrical.getValue() == "meter" && imperial.getValue() == "feet") {
                    converted_value = Double.parseDouble(metrical_get_value) * 3.2808399;
                }

                if (metrical.getValue() == "meter" && imperial.getValue() == "yard") {
                    converted_value = Double.parseDouble(metrical_get_value) * 1.0936133;
                }

                if (metrical.getValue() == "meter" && imperial.getValue() == "mile") {
                    converted_value = Double.parseDouble(metrical_get_value) * 0.000621371192;
                }


                //km -> %
                if (metrical.getValue() == "kilometer" && imperial.getValue() == "inch") {
                    converted_value = Double.parseDouble(metrical_get_value) * 39370.0787;
                }


                if (metrical.getValue() == "kilometer" && imperial.getValue() == "feet") {
                    converted_value = Double.parseDouble(metrical_get_value) * 3280.8399;
                }

                if (metrical.getValue() == "kilometer" && imperial.getValue() == "yard") {
                    converted_value = Double.parseDouble(metrical_get_value) * 1093.6133;
                }

                if (metrical.getValue() == "kilometer" && imperial.getValue() == "mile") {
                    converted_value = Double.parseDouble(metrical_get_value) * 0.621371192;
                }

                 range_textfield.setText(String.valueOf(converted_value));
            }
        } else {
             range_textfield.setText("Err");
        }


    }

    public void swap_pushed(ActionEvent actionEvent){
        metrical_get_value = from_field.getText();
        imperial_get_value = to_field.getText();

        swap = metrical_get_value;
        metrical_get_value = imperial_get_value;
        imperial_get_value = swap;

        from_field.setText(metrical_get_value);
        to_field.setText(imperial_get_value);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        metrical.setValue("millimeter");
        this.from_spinner.setValueFactory(metrical);
        imperial.setValue("inch");
        this.to_spinner.setValueFactory(imperial);
    }
}
