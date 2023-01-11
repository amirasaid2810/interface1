package com.example.interface1;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import java.net.URL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public  class SupplierController implements Initializable {


    public TextField SuppLastName;
    public TextField SuppFirstName;
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

    Connection conn2 = null;

    ResultSet rs2 = null;
    PreparedStatement ps2 = null;


    @FXML
    void AddMissingMeds(ActionEvent event) {
        Float QTE = Float.parseFloat(QteMed.getText());
        Float Price = Float.parseFloat(PriceMed.getText());

        float tot = Price * QTE;
        TotalPrice.setText(Float.toString(tot));
    }

    @FXML
    void ValidateCommande(ActionEvent event) {
        Dialog<String> dialog = new Dialog();
        dialog.setTitle("validate");
        dialog.setHeaderText("This commande is sent to this email Adress:");
        ButtonType buttonType= new ButtonType("Ok", ButtonBar.ButtonData.OK_DONE);
        String mailAdressText = SuppMailAdress.getText().toString();
        dialog.setContentText(mailAdressText);
        dialog.getDialogPane().getButtonTypes().add(buttonType);
        dialog.show();
    }
    @FXML
    private void ADD(ActionEvent event) {
        conn2 = SupplierSQLconnection.ConnectDb2();
        String sql2 = "Select * from FactureTable";
        try {
            assert conn2 != null;
            ps2=conn2.prepareStatement(sql2);
            ps2.setString(1,RefMed.getText());
            ps2.setString(2,QteMed.getText());
            ps2.setString(3,PriceMed.getText());
            ps2.setString(4,DCIMed.getText());

              rs2=ps2.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    private void VALIDATE(ActionEvent event) {
        conn2 = SupplierSQLconnection.ConnectDb2();
        String sql2 = "Select * from FactureTable";
        try {
            assert conn2 != null;
            ps2=conn2.prepareStatement(sql2);
            ps2.setString(1,SuppFirstName.getText());
            ps2.setString(2,SuppLastName.getText());
            ps2.setString(3,SuppMailAdress.getText());
            rs2=ps2.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
