package com.example.interface1;


import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javax.swing.*;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class SellsController  implements Initializable {


    @FXML
    private TableColumn<SellsTableClass, String> DATEcolumn;

    @FXML
    private Text NEWtext;

    @FXML
    private TableColumn<SellsTableClass, String> Pricecolumn;

    @FXML
    private TextField QTE;

    @FXML
    private TableColumn<SellsTableClass, Integer> QTEcolumn;

    @FXML
    private TableColumn<SellsTableClass, String> REFcolumn;

    @FXML
    private TextField date;

    @FXML
    private TableColumn<SellsTableClass,Integer > idcolumn;

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
    @FXML
    private TableView<SellsTableClass> sellsTableView ;
    ObservableList<SellsTableClass> List;
     int index = -1;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    public void SellNewMedication (ActionEvent Event){
        idcolumn.setText(String.valueOf(medicationid));
        REFcolumn.setText(String.valueOf(medicationREF));
        DATEcolumn.setText(String.valueOf(date));
        Pricecolumn.setText(String.valueOf(medprice));

          int qte = Integer.parseInt(QTE.getText());
          int qteTable = Integer.parseInt(QTEcolumn.getText());
          qteTable=qteTable-qte;
          QTEcolumn.setText(Integer.toString(qteTable));

        assert conn != null;
        conn = SellsSQLconnection.ConnectDb();
       String sql = "insert into sellsTables(purchaseID , REF , Date , Qte , Price)values(?,?,?,?,?) ";
        try{
           assert conn != null;
           ps =conn.prepareStatement(sql);
            ps.setString(1, QTEcolumn.getText());
            ps.setString(2,DATEcolumn.getText());
            ps.setString(3,REFcolumn.getText());
           ps.setString(4,Pricecolumn.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null,"SellsTables add success");


       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,e);
          }

        List = SellsSQLconnection.getDataSellsTable();
         }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
      idcolumn.setCellValueFactory(new PropertyValueFactory<>("Purchase ID"));
       REFcolumn.setCellValueFactory(new PropertyValueFactory<>("REF"));
        DATEcolumn.setCellValueFactory(new PropertyValueFactory<>("Date"));
        QTEcolumn.setCellValueFactory(new PropertyValueFactory<>("QTE"));
        Pricecolumn.setCellValueFactory(new PropertyValueFactory<>("Price"));
        sellsTableView.setItems(List);
          List = SellsSQLconnection.getDataSellsTable();
    }


}
