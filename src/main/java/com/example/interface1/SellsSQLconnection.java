package com.example.interface1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SellsSQLconnection {
    Connection conn = null;

     public static Connection ConnectDb(){
         try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/AminaPuthereTableName");
             JOptionPane.showMessageDialog(null,"ConnectionEstablished");
             return conn;
         }catch (Exception e) {
             JOptionPane.showMessageDialog(null,e);
             return null;
         }
     }
     public static ObservableList<SellsTableClass> getDataSellsTable(){
       Connection conn = ConnectDb();
       ObservableList<SellsTableClass> List= FXCollections.observableArrayList();
       try {
           assert conn != null;
           PreparedStatement ps = conn.prepareStatement("select * from SellsTableClass");
           ResultSet rs = ps.executeQuery();

           while (rs.next()){

               List.add((new SellsTableClass(Integer.parseInt (rs.getString("PurchaseID")), rs.getString("REF"), rs.getString("Date"),rs.getString("Qte"),rs.getString("Price") )));
           }
       }catch (Exception e) {
           throw new RuntimeException(e);
       }



         return null;
     }




}
