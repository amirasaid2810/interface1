package com.example.interface1;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SupplierSQLconnection {
    Connection conn2 = null;

    public static Connection ConnectDb2() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost/AminaPuthereTableName");
            JOptionPane.showMessageDialog(null, "ConnectionEstablished");
            return conn2;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}

