package mschottGenerator;

import java.io.IOException;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.application.Application;

public class Main extends Application
{
    public static Stage primaryStage;
    public static Pane root;
    public static Scene scene;
    
    public void start(final Stage primaryStage) throws IOException {
        Main.primaryStage = primaryStage;
        Main.root = (Pane)FXMLLoader.load(this.getClass().getResource("/MainGenerator.fxml"));
        Main.scene = new Scene((Parent)Main.root, 1280.0, 720.0);
        primaryStage.setTitle("Allocation Generator");
        primaryStage.setScene(Main.scene);
        primaryStage.show();
    }
    
    public static void main(final String[] args) {
        launch(args);
    }
}
