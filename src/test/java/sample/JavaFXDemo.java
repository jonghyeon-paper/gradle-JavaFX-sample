package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class JavaFXDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        String message = "Hello World!";
        Button btnHello = new Button();
        btnHello.setText(message);

        StackPane root = new StackPane();
        root.getChildren().add(btnHello);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle(message);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}