package com.example.interface1;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;



import java.net.URL;

import java.util.ResourceBundle;

public  class SupplierController implements Initializable {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    private Button addbutton;

    @FXML
    private Button validateButton;
    @FXML
    private TextField DCIMed;

    @FXML
    private TextField PriceMed;

    @FXML
    private TextField QteMed;

    @FXML
    private TextField RefMed;

    @FXML
    private Text TotalPrice;
    @FXML
    private TextField SuppMailAdress;



    @FXML
    void AddMissingMeds(ActionEvent event) {
        Float QTE = Float.parseFloat(QteMed.getText());
        Float Price = Float.parseFloat(PriceMed.getText());

        float tot = Price * QTE;
        TotalPrice.setText(Float.toString(tot));
    }

    @FXML
    void ValidateCommande(ActionEvent event) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("validate");
        dialog.setHeaderText("This commande is sent to this email Adress:");
        String mailAdressText = SuppMailAdress.getText();
        dialog.setContentText(mailAdressText);
        dialog.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
