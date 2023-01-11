package com.example.interface1;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.*;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class StockController implements Initializable {
    @FXML
    private Button AddButton;
    @FXML
    private TableView<Meds> TableMed;

    @FXML
    private TableColumn<Meds, Integer> ColDCI;

    @FXML
    private TableColumn<Meds, Integer> ColDExpd;

    @FXML
    private TableColumn<Meds, Integer> ColDPerm;

    @FXML
    private TableColumn<Meds, String> ColName;

    @FXML
    private TableColumn<Meds, Integer> ColPrice;

    @FXML
    private TableColumn<Meds, Integer> ColQte;

    @FXML
    private TableColumn<Meds, Integer> ColRef;

    @FXML
    private Button DeleteButton;


    @FXML
    private Button UpdateButton;
    @FXML
    private TextField TextDCI;

    @FXML
    private TextField TextName;

    @FXML
    private TextField TextPrice;

    @FXML
    private TextField TextRef;
    @FXML
    private TextField FilterField;
    ObservableList<Meds> list;
    ObservableList<Meds> DataList;


    int index = -1;
    Connection conn2 = null;
    ResultSet rs2 = null;
    PreparedStatement ps2 = null;


    public void UpdateMeds(){
        ColName.setCellValueFactory(new PropertyValueFactory<Meds,String>("Name"));
        ColRef.setCellValueFactory(new PropertyValueFactory<Meds,Integer>("Ref"));
        ColQte.setCellValueFactory(new PropertyValueFactory<Meds,Integer>("Qte"));
        ColDCI.setCellValueFactory(new PropertyValueFactory<Meds,Integer>("DCI"));
        ColPrice.setCellValueFactory(new PropertyValueFactory<Meds,Integer>("Price"));
        ColPrice.setCellValueFactory(new PropertyValueFactory<Meds,Integer>("Dexod"));
        ColPrice.setCellValueFactory(new PropertyValueFactory<Meds,Integer>("Dperm"));
        list = StockSQLconnection.getDataMeds();
        TableMed.setItems( list);
    }
    public void DeleteMeds() {
        conn2 = StockSQLconnection.ConnectDb2();
        String sql = "Delete from Meds where Med_REF= ?";
        try {
            ps2=conn2.prepareStatement(sql);
            ps2.setString(1,TextRef.getText());
            ps2.execute();
            JOptionPane.showMessageDialog(null,"Delete");
            UpdateMeds();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }

    }
   // void SearchMeds() {
    //   ColName.setCellValueFactory(new PropertyValueFactory<Meds,String>("Name"));
    // ColRef.setCellValueFactory(new PropertyValueFactory<Meds,Integer>("Ref"));
          //  } else {
          //     return false;
    // });}


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        UpdateMeds();



    }

    public void AddMeds(javafx.event.ActionEvent actionEvent) {
        conn2 = StockSQLconnection.ConnectDb2();
        String sql = "insert into sellsTables(REF , DCI ,Name, PRICE ,Qte,Dexpd,Dperm)values(?,?,?,?,?,?,?) ";
        try{
            assert conn2 != null;
            ps2 =conn2.prepareStatement(sql);
            ps2.setString(1, TextName.getText());
            ps2.setString(2,TextRef.getText());
            ps2.setString(3,TextDCI.getText());
            ps2.setString(4,TextPrice.getText());
            ps2.execute();
            JOptionPane.showMessageDialog(null,"Meds add success");


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
        UpdateMeds();
    }
}