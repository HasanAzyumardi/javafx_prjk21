import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {


    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("PriceList");

        FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("MainScene.fxml"));
            
            // Show the scene containing the root layout.
            Scene scene = new Scene(loader.load());
            primaryStage.setScene(scene);
            primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}