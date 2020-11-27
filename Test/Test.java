

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;


public class Test extends Application {
    public Test() {
        System.out.println("Test constructor is invoked");
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("Start method is invoked");
    }

    public static void main(String[] args) {
        System.out.println("Launch application");
        Application.launch(args);
    }


}
