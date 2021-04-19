package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField; // EZ KELL MERT KÜLÖNBEN EGY SZAR FÚ

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Num implements Initializable {
    @FXML
    private Spinner<String> from_spinner;
    @FXML
    private Spinner<String> to_spinner;
    @FXML
    private Button convert_pressed;

    @FXML
    private TextField upper;
    @FXML
    private TextField lower;


    String from_value_holder;
    String to_value_holder;
    String calculated_value;

    ObservableList<String> from_values = FXCollections.observableArrayList("Decimal", "Binary", "Hexadecimal", "Octal");
    SpinnerValueFactory<String> fv = new SpinnerValueFactory.ListSpinnerValueFactory(from_values);


    ObservableList<String> to_values = FXCollections.observableArrayList("Decimal", "Binary", "Hexadecimal", "Octal");
    SpinnerValueFactory<String> tv = new SpinnerValueFactory.ListSpinnerValueFactory(to_values);



    public void convert_pressed(ActionEvent actionEvent) {
        from_value_holder = upper.getText();
        to_value_holder = lower.getText();

            if(!upper.getText().isEmpty()){
                if (fv.getValue() == "Decimal" && tv.getValue() == "Binary") {
                    calculated_value = Integer.toBinaryString(Integer.parseInt(from_value_holder));
                }
                if (fv.getValue() == "Decimal" && tv.getValue() == "Hexadecimal") {
                    calculated_value = Integer.toHexString(Integer.parseInt(from_value_holder));
                }
                if (fv.getValue() == "Decimal" && tv.getValue() == "Octal") {
                    calculated_value = Integer.toOctalString(Integer.parseInt(from_value_holder));
                }



                if (fv.getValue() == "Binary" && tv.getValue() == "Decimal") {
                    calculated_value = String.valueOf(Integer.parseInt(from_value_holder,2));
                }
                if (fv.getValue() == "Binary" && tv.getValue() == "Hexadecimal") {
                    calculated_value = Integer.toHexString(Integer.parseInt(from_value_holder,2));
                }
                if (fv.getValue() == "Binary" && tv.getValue() == "Octal") {
                    calculated_value = Integer.toOctalString(Integer.parseInt(from_value_holder,2));
                }



                if (fv.getValue() == "Hexadecimal" && tv.getValue() == "Binary") {
                    calculated_value = Integer.toBinaryString(Integer.parseInt(from_value_holder, 16));
                }
                if (fv.getValue() == "Hexadecimal" && tv.getValue() == "Decimal") {
                    calculated_value = Integer.toHexString(Integer.parseInt(from_value_holder, 16));
                }
                if (fv.getValue() == "Hexadecimal" && tv.getValue() == "Octal") {
                    calculated_value = Integer.toOctalString(Integer.parseInt(from_value_holder, 16));
                }



                if (fv.getValue() == "Octal" && tv.getValue() == "Binary") {
                    calculated_value = Integer.toBinaryString(Integer.parseInt(from_value_holder,8));
                }
                if (fv.getValue() == "Octal" && tv.getValue() == "Hexadecimal") {
                    calculated_value = Integer.toHexString(Integer.parseInt(from_value_holder,8));
                }
                if (fv.getValue() == "Octal" && tv.getValue() == "Decimal") {
                    calculated_value = String.valueOf(Integer.parseInt(from_value_holder,8));
                }

            lower.setText(String.valueOf(calculated_value));
        } else {
            lower.setText("Err");
        }
    }







    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fv.setValue("Decimal");
        this.from_spinner.setValueFactory(fv);
        tv.setValue("Binary");
        this.to_spinner.setValueFactory(tv);
    }

}
