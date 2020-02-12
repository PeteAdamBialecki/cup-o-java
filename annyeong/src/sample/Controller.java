package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML private TextField firstName;

    public void howToSayHelloInKorean(ActionEvent actionEvent) {
        System.out.printf("안녕 %s! %n", firstName.getText());
    }
}
