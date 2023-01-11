package com.example.interface1;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class AdminPanel {
    public Button SellsButton;
    public Button SuppliersButton;
    public Button StockButton;
    public Button AddButton;

    public void SellsInterface() throws IOException {
        Stage stage = (Stage) SellsButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Sells.fxml")));
        primaryStage.setTitle("Sells interface");
        primaryStage.setScene(new Scene(root,320,240));
        primaryStage.show();
    }


    public void SupplierInterface() throws IOException{
        Stage stage = (Stage) SuppliersButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Supplier.fxml")));
        primaryStage.setTitle("Supplier interface");
        primaryStage.setScene(new Scene(root,320,240));
        primaryStage.show();

    }

    public void StockInterface() throws IOException{
        Stage stage = (Stage) StockButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("stock.fxml")));
        primaryStage.setTitle("Stock interface");
        primaryStage.setScene(new Scene(root,320,240));
        primaryStage.show();

    }

    public void registerInterface() throws IOException{
        Stage stage = (Stage) AddButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("register.fxml")));
        primaryStage.setTitle("register interface");
        primaryStage.setScene(new Scene(root,320,240));
        primaryStage.show();

    }
}
