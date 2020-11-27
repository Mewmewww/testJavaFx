package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {
    // Kobler XML med java.

    @FXML
    TextArea textfelt;
    @FXML
    TextField textfeltone;
    @FXML
    TextField textfeltwo;

    public void noteDownSins() {
            System.out.println("Your sins have been noted down.");
            textfelt.appendText("\n Your sins have been noted down! \n" +
                    "\n");

    }

    public void randomResult() {
        Random rand = new Random();

        int randomRange = rand.nextInt((3-1) + 1) + 1;

        switch (randomRange) {
            case 1:
                textfeltwo.appendText("\n Your sins are unforgivable");
                break;
            case 2:
                textfeltwo.appendText("\n Alright, you'll be fine - it's no biggy.");
                break;
            case 3:
                textfeltwo.appendText("\n Did you really think that was a sin? He/she was the culprit!");
                break;
        }
    }
}

