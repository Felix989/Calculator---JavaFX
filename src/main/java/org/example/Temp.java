package org.example;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;





public class Temp implements Initializable {
    @FXML
    private TextField input;
    @FXML
    private RadioButton celcius_checked;
    @FXML
    private RadioButton kelvin_checked;
    @FXML
    private TextField value;

    ToggleGroup temperature = new ToggleGroup();
    String converted_value;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        celcius_checked.setToggleGroup(temperature);
        kelvin_checked.setToggleGroup(temperature);
        temperature.selectToggle(kelvin_checked);

    }


    //throw error when nothing is enter, but the button is pressed
    public void convert_pressed(ActionEvent actionEvent) {
        if(kelvin_checked.isSelected() && !celcius_checked.isSelected()
                ||
           !kelvin_checked.isSelected() && celcius_checked.isSelected()){

                if(kelvin_checked.isSelected()){
                    converted_value = String.valueOf(Integer.parseInt(input.getText()) - 273.15);
                    value.setText(converted_value);
                }

                if(celcius_checked.isSelected()){
                    converted_value = String.valueOf(Integer.parseInt(input.getText()) + 273.15);
                    value.setText(converted_value);
                }
        } else {
            value.setText("Err");
        }

        if(!kelvin_checked.isSelected() && !celcius_checked.isSelected()){
            value.setText("Err");
        }
    }
}
