package org.example;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;//EZT KELL BEIMPORTÁLNI HA VALAMI BASZAKODIK LOL???
import java.awt.*;//EZ MEG EGY FOS, SOSE IMPORTÁLD!!!
import java.net.URL;
import java.util.ResourceBundle;


public class Curr implements Initializable {
    @FXML
    private TextField from_field;
    @FXML
    private TextField to_field;
    @FXML
    private TextField value_display;
    @FXML
    private Spinner<String> from_spinner;
    @FXML
    private Spinner<String> to_spinner;


    ObservableList<String> from_values = FXCollections.observableArrayList("HUF", "EUR", "RUB", "USD", "JPY");
    SpinnerValueFactory<String> from_value_factory = new SpinnerValueFactory.ListSpinnerValueFactory(from_values);


    ObservableList<String> to_values = FXCollections.observableArrayList("HUF", "EUR", "RUB", "USD", "JPY");
    SpinnerValueFactory<String> to_value_factory = new SpinnerValueFactory.ListSpinnerValueFactory(to_values);





    public void convert_pushed(ActionEvent actionEvent) {
        double converted_value = 0;
        if(from_field.getText().isEmpty() && !to_field.getText().isEmpty()
                ||
            !from_field.getText().isEmpty() && to_field.getText().isEmpty()
        ){
            if(!from_field.getText().isEmpty() && to_field.getText().isEmpty()){
                if (from_value_factory.getValue() == "HUF" && to_value_factory.getValue() == "EUR") {
                    converted_value = Double.parseDouble(from_field.getText()) * 0.0027;
                }
                if (from_value_factory.getValue() == "HUF" && to_value_factory.getValue() == "RUB") {
                    converted_value = Double.parseDouble(from_field.getText()) * 0.24;
                }
                if (from_value_factory.getValue() == "HUF" && to_value_factory.getValue() == "USD") {
                    converted_value = Double.parseDouble(from_field.getText()) * 0.0033;
                }
                if (from_value_factory.getValue() == "HUF" && to_value_factory.getValue() == "JPY") {
                    converted_value = Double.parseDouble(from_field.getText()) * 0.36;
                }


                if (from_value_factory.getValue() == "EUR" && to_value_factory.getValue() == "HUF") {
                    converted_value = Double.parseDouble(from_field.getText()) * 367.04;
                }
                if (from_value_factory.getValue() == "EUR" && to_value_factory.getValue() == "RUB") {
                    converted_value = Double.parseDouble(from_field.getText()) * 87.57;
                }
                if (from_value_factory.getValue() == "EUR" && to_value_factory.getValue() == "USD") {
                    converted_value = Double.parseDouble(from_field.getText()) * 1.20;
                }
                if (from_value_factory.getValue() == "EUR" && to_value_factory.getValue() == "JPY") {
                    converted_value = Double.parseDouble(from_field.getText()) * 130.31;
                }


                if (from_value_factory.getValue() == "RUB" && to_value_factory.getValue() == "HUF") {
                    converted_value = Double.parseDouble(from_field.getText()) * 4.19;
                }
                if (from_value_factory.getValue() == "RUB" && to_value_factory.getValue() == "EUR") {
                    converted_value = Double.parseDouble(from_field.getText()) * 0.011;
                }
                if (from_value_factory.getValue() == "RUB" && to_value_factory.getValue() == "USD") {
                    converted_value = Double.parseDouble(from_field.getText()) * 0.014;
                }
                if (from_value_factory.getValue() == "RUB" && to_value_factory.getValue() == "JPY") {
                    converted_value = Double.parseDouble(from_field.getText()) * 1.49;
                }


                if (from_value_factory.getValue() == "USD" && to_value_factory.getValue() == "HUF") {
                    converted_value = Double.parseDouble(from_field.getText()) * 307.06;
                }
                if (from_value_factory.getValue() == "USD" && to_value_factory.getValue() == "EUR") {
                    converted_value = Double.parseDouble(from_field.getText()) * 0.84;
                }
                if (from_value_factory.getValue() == "USD" && to_value_factory.getValue() == "RUB") {
                    converted_value = Double.parseDouble(from_field.getText()) * 73.26;
                }
                if (from_value_factory.getValue() == "USD" && to_value_factory.getValue() == "JPY") {
                    converted_value = Double.parseDouble(from_field.getText()) * 109.02;
                }




                if (from_value_factory.getValue() == "JPY" && to_value_factory.getValue() == "HUF") {
                    converted_value = Double.parseDouble(from_field.getText()) * 2.82;
                }
                if (from_value_factory.getValue() == "JPY" && to_value_factory.getValue() == "EUR") {
                    converted_value = Double.parseDouble(from_field.getText()) * 0.0077;
                }
                if (from_value_factory.getValue() == "JPY" && to_value_factory.getValue() == "RUB") {
                    converted_value = Double.parseDouble(from_field.getText()) * 0.67;
                }
                if (from_value_factory.getValue() == "JPY" && to_value_factory.getValue() == "USD") {
                    converted_value = Double.parseDouble(from_field.getText()) * 0.0092;
                }


                value_display.setText(String.valueOf(converted_value));
            }



            if(from_field.getText().isEmpty() && !to_field.getText().isEmpty()){
                if (to_value_factory.getValue() == "HUF" && from_value_factory.getValue() == "EUR") {
                    converted_value = Double.parseDouble(to_field.getText()) * 0.0027;
                }
                if (to_value_factory.getValue() == "HUF" && from_value_factory.getValue() == "RUB") {
                    converted_value = Double.parseDouble(to_field.getText()) * 0.24;
                }
                if (to_value_factory.getValue() == "HUF" && from_value_factory.getValue() == "USD") {
                    converted_value = Double.parseDouble(to_field.getText()) * 0.0033;
                }
                if (to_value_factory.getValue() == "HUF" && from_value_factory.getValue() == "JPY") {
                    converted_value = Double.parseDouble(to_field.getText()) * 0.36;
                }


                if (to_value_factory.getValue() == "EUR" && from_value_factory.getValue() == "HUF") {
                    converted_value = Double.parseDouble(to_field.getText()) * 367.04;
                }
                if (to_value_factory.getValue() == "EUR" && from_value_factory.getValue() == "RUB") {
                    converted_value = Double.parseDouble(to_field.getText()) * 87.57;
                }
                if (to_value_factory.getValue() == "EUR" && from_value_factory.getValue() == "USD") {
                    converted_value = Double.parseDouble(to_field.getText()) * 1.20;
                }
                if (to_value_factory.getValue() == "EUR" && from_value_factory.getValue() == "JPY") {
                    converted_value = Double.parseDouble(to_field.getText()) * 130.31;
                }


                if (to_value_factory.getValue() == "RUB" && from_value_factory.getValue() == "HUF") {
                    converted_value = Double.parseDouble(to_field.getText()) * 4.19;
                }
                if (to_value_factory.getValue() == "RUB" && from_value_factory.getValue() == "EUR") {
                    converted_value = Double.parseDouble(to_field.getText()) * 0.011;
                }
                if (to_value_factory.getValue() == "RUB" && from_value_factory.getValue() == "USD") {
                    converted_value = Double.parseDouble(to_field.getText()) * 0.014;
                }
                if (to_value_factory.getValue() == "RUB" && from_value_factory.getValue() == "JPY") {
                    converted_value = Double.parseDouble(to_field.getText()) * 1.49;
                }


                if (to_value_factory.getValue() == "USD" && from_value_factory.getValue() == "HUF") {
                    converted_value = Double.parseDouble(to_field.getText()) * 307.06;
                }
                if (to_value_factory.getValue() == "USD" && from_value_factory.getValue() == "EUR") {
                    converted_value = Double.parseDouble(to_field.getText()) * 0.84;
                }
                if (to_value_factory.getValue() == "USD" && from_value_factory.getValue() == "RUB") {
                    converted_value = Double.parseDouble(to_field.getText()) * 73.26;
                }
                if (to_value_factory.getValue() == "USD" && from_value_factory.getValue() == "JPY") {
                    converted_value = Double.parseDouble(to_field.getText()) * 109.02;
                }




                if (to_value_factory.getValue() == "JPY" && from_value_factory.getValue() == "HUF") {
                    converted_value = Double.parseDouble(to_field.getText()) * 2.82;
                }
                if (to_value_factory.getValue() == "JPY" && from_value_factory.getValue() == "EUR") {
                    converted_value = Double.parseDouble(to_field.getText()) * 0.0077;
                }
                if (to_value_factory.getValue() == "JPY" && from_value_factory.getValue() == "RUB") {
                    converted_value = Double.parseDouble(to_field.getText()) * 0.67;
                }
                if (to_value_factory.getValue() == "JPY" && from_value_factory.getValue() == "USD") {
                    converted_value = Double.parseDouble(to_field.getText()) * 0.0092;
                }

                value_display.setText(String.valueOf(converted_value));

            }
        } else {
            value_display.setText("Err");
        }
    }









    public void swap_pushed(ActionEvent actionEvent){
        String one = from_field.getText();
        String two = to_field.getText();

        String swap = one;
        one = two;
        two = swap;

        from_field.setText(one);
        to_field.setText(two);
    }






    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        from_value_factory.setValue("HUF");
        this.from_spinner.setValueFactory(from_value_factory);


        to_value_factory.setValue("EUR");
        this.to_spinner.setValueFactory(to_value_factory);
    }
}

