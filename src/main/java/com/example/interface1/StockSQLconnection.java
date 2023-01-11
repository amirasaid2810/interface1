package com.example.interface1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StockSQLconnection {
    Connection conn = null;

    public static Connection ConnectDb2(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost/AminaPuthereTableName");
            JOptionPane.showMessageDialog(null,"ConnectionEstablished");
            return conn2;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    public static ObservableList<Meds> getDataMeds(){
        Connection conn2 = ConnectDb2();
        ObservableList<Meds> List= FXCollections.observableArrayList();
        try {
            assert conn2 != null;
            PreparedStatement ps = conn2.prepareStatement("select * from Meds");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){

                List.add((new Meds(rs.getInt("REF"),rs.getInt("Qte"),rs.getInt("DCI"),rs.getInt("Price"),rs.getInt("Dexpd"),rs.getInt("Dperm"),Integer.parseInt(rs.getString("Name") ))));
            }
        }catch (Exception e) {}



        return null;
    }

    {

    }
}
