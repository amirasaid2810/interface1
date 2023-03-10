package com.example.interface1;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;


public class HomePageController {
    public Button adminButton;
    @FXML
    private Button SellsButton;
    @FXML
    private Button PurchaseButton;
    @FXML
    private Button stockButton;

    public void SellsButtonInterface()  throws IOException {
        Stage stage = (Stage) SellsButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Sells.fxml")));
        primaryStage.setTitle("Sells interface");
        primaryStage.setScene(new Scene(root,320,240));
        primaryStage.show();
    }


    public void PurchaseButtonInterface() throws  IOException {
        Stage stage = (Stage) PurchaseButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Supplier.fxml")));
        primaryStage.setTitle("Supplier interface");
        primaryStage.setScene(new Scene(root, 320, 240));
        primaryStage.show();
    }

    public void stockButtonInterface() throws IOException {
        Stage stage = (Stage) stockButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("stock.fxml")));
        primaryStage.setTitle("Stock interface");
        primaryStage.setScene(new Scene(root, 320, 240));
        primaryStage.show();
    }

    public void adminPanelInterface()throws IOException {
        Stage stage = (Stage) adminButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Adminpanel.fxml")));
        primaryStage.setTitle("admin interface");
        primaryStage.setScene(new Scene(root, 320, 240));
        primaryStage.show();
    }
}
