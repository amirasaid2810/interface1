package com.example.interface1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.net.URL;
import java.util.ResourceBundle;

public class SellsController  implements Initializable {


    @FXML
    private TableColumn<?, ?> DATEcolumn;

    @FXML
    private Text NEWtext;

    @FXML
    private TableColumn<?, ?> Pricecolumn;

    @FXML
    private TextField QTE;

    @FXML
    private TableColumn<?, ?> QTEcolumn;

    @FXML
    private TableColumn<?, ?> REFcolumn;

    @FXML
    private TextField date;

    @FXML
    private TableColumn<?, ?> idcolumn;

    @FXML
    private TextField medicationREF;

    @FXML
    private TextField medicationid;

    @FXML
    private TextField medprice;

    @FXML
    private Text recentsellsText;
    @FXML
    private Button sellbutton;


public void SellNewMedication ( ActionEvent actionEvent){
    medicationid.setText(String.valueOf(idcolumn));
    medicationREF.setText(String.valueOf(REFcolumn));
    date.setText(String.valueOf(DATEcolumn));
    medprice.setText(String.valueOf(Pricecolumn));

        int qte = Integer.parseInt(QTE.getText());
        int qteTable = Integer.parseInt(QTEcolumn.getText());
        qteTable=qteTable-qte;

   }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
