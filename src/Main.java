import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.application.Application;

/**
 * Main
 */
public class Main extends Application
{
    public static Stage primaryStage;
    public static Pane root;
    public static Scene scene;

    public static Pane rootSec;
    public static Scene sceneSec;
    
    public void start(final Stage primaryStage) throws IOException {
        Main.primaryStage = primaryStage;
        Main.root = FXMLLoader.load(this.getClass().getResource("/MainGenerator.fxml"));
        Main.rootSec = FXMLLoader.load(this.getClass().getResource("/Lottery.fxml"));
        Main.sceneSec = new Scene(Main.rootSec, 1280.0, 720.0);
        Main.scene = new Scene(Main.root, 1280.0, 720.0);
        primaryStage.setTitle("Group Allocation");
        primaryStage.setScene(Main.scene);
        primaryStage.show();

    }
    
    public static void main(final String[] args) {
        launch(args);
    }
}
