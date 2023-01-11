package com.example.interface1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
      //  Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("homepage.fxml")));
    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sells.fxml"));
      //  FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("Supplier.fxml"));
        // FXMLLoader fxmlLoader3 = new FXMLLoader(HelloApplication.class.getResource("stock.fxml"));
        Scene scene1 = new Scene(fxmlLoader.load(), 320, 240);
       //Scene scene2 = new Scene (fxmlLoader2.load());
       // Scene scene3 = new Scene(fxmlLoader3.load());
      // stage.setScene(new Scene(root));
        stage.setTitle("Hello!");
       // stage.initStyle(StageStyle.TRANSPARENT);
       stage.setScene(scene1);
        //stage.setScene(scene2);
       // stage.setScene(scene3);
       stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}