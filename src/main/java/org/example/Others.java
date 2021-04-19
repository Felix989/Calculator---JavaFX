package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Others implements Initializable {
        @FXML
        private TableColumn<ResultClass, Double> FirstNumber;
        @FXML
        private TableColumn<ResultClass, Double> SecondNumber;
        @FXML
        private TableColumn<ResultClass, String> Operation;
        @FXML
        private TableColumn<ResultClass, Double> Result;
        @FXML
        public TableView<ResultClass> Table;


    //@FXML
    //private TableView<ResultClass> Table = new TableView<ResultClass>();
    //private final ObservableList<ResultClass> data =  FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FirstNumber.setCellValueFactory(new PropertyValueFactory<>("FirstNumber"));
        SecondNumber.setCellValueFactory(new PropertyValueFactory<>("SecondNumber"));
        Operation.setCellValueFactory(new PropertyValueFactory<>("Operation"));
        Result.setCellValueFactory(new PropertyValueFactory<>("Result"));
        ObservableList<ResultClass> data = FXCollections.observableArrayList();
        //ResultClass rc = new ResultClass(1.0,1.0,"add",2.0);//default element for testing
        //data.add(rc);

        //ObservableList<ResultClass> holder_two = DBController.getResults();
        data = DBController.getResults();

        Table.setItems(data);
        Table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        //Table.getColumns().addAll(FirstNumber, SecondNumber, Operation, Result);


        //ResultClass rc = new ResultClass(1.0,1.0,"add",2.0);
        //data.add(rc);
        //Table.setItems(data);
        //Table.getItems().add(rc);
    }
/*
        ObservableList<ResultClass> holder = FXCollections.observableArrayList(
            new ResultClass(1.0,1.0,"add",2.0),
            new ResultClass(3.0,3.0,"add",6.0),
            new ResultClass(5.0,5.0,"add",10.0),
            new ResultClass(7.0,7.0,"add",14.0),
            new ResultClass(9.0,9.0,"add",18.0)
        );

        //List<ResultClass> list = ResultClass.getAllInstance();
        //Table.getColumns().addAll(FirstNumber, SecondNumber, Operation, Result);
        FirstNumber.setCellValueFactory(new PropertyValueFactory<ResultClass, Double>("FirstName"));
        SecondNumber.setCellValueFactory(new PropertyValueFactory<ResultClass, Double>("SecondNumber"));
        Operation.setCellValueFactory(new PropertyValueFactory<ResultClass, String>("Operation"));
        Result.setCellValueFactory(new PropertyValueFactory<ResultClass, Double>("Result"));
        Table.setItems(holder);
       // Table.setItems((ObservableList<ResultClass>) list);
    }*/
}
