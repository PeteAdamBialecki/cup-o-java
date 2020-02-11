package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        Group root = new Group();
//        Text txt = new Text("Annyeong!");
//        txt.setFont(new Font("Georgia", 80));
//        Label label = new Label("Name: ");
//        TextField nameFld = new TextField();
//        GridPane grid = new GridPane();
//        grid.add(label, 0, 0);
//        grid.add(nameFld, 1, 0);
//        grid.setHgap(20);
//        Button btn = new Button();
//        grid.add(btn, 1, 1);
//        // grid.setGridLinesVisible(true);
//        btn.setText("Say, '안녕!'");
//        btn.setOnAction(evt -> System.out.printf("Annyeong %s!%n",
//                nameFld.getText()));
//        txt.setY(50);
//        VBox box = new VBox();
//        box.getChildren().addAll(txt, grid);
//        root.getChildren().add(box);
        primaryStage.setTitle("Annyeong");
        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
