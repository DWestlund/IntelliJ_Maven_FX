package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("UI/main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("SAKILA");
        stage.setScene(scene);
        stage.show();
    }
}
