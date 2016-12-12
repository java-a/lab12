import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 * Created by junyuan on 12/12/2016.
 */
public class Triangle extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Triangle");

        // Label Setting
        Label labelFirst = new Label("1st Edge");
        Label labelSecond = new Label("2nd Edge");
        Label labelThird = new Label("3rd Edge");
        final Label labelResult = new Label("");

        // Textfield Setting
        final TextField textFirst = new TextField();
        final TextField textSecond = new TextField();
        final TextField textThird = new TextField();

        // Button Setting
        Button btnShow = new Button();
        btnShow.setText("Calculate triangle area");

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setHgap(5);
        pane.setVgap(5);

        pane.setConstraints(labelFirst, 0, 0);
        pane.setConstraints(textFirst, 1, 0);
        pane.setConstraints(labelSecond, 0, 1);
        pane.setConstraints(textSecond, 1, 1);
        pane.setConstraints(labelThird, 0, 2);
        pane.setConstraints(textThird, 1, 2);
        pane.setConstraints(btnShow, 0, 3);
        pane.setConstraints(labelResult, 0, 4);

        pane.getChildren().add(labelFirst);
        pane.getChildren().add(textFirst);
        pane.getChildren().add(labelSecond);
        pane.getChildren().add(textSecond);
        pane.getChildren().add(labelThird);
        pane.getChildren().add(textThird);
        pane.getChildren().add(btnShow);
        pane.getChildren().add(labelResult);

        btnShow.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                double a = Double.parseDouble(textFirst.getText());
                double b = Double.parseDouble(textSecond.getText());
                double c = Double.parseDouble(textThird.getText());

                String result = "";
                if (a + b > c && a + c > b && b + c > a) {
                    double s = (a + b + c) / 2;
                    double area = Math.pow(s * (s - a) * (s - b) * (s - c), 0.5);
                    result = "The area of the triangle is: " + area;
                } else {
                    result = "Illegal triangle!";
                }
                labelResult.setText(result);
            }
        });

        primaryStage.setScene(new Scene(pane, 400, 280));
        primaryStage.show();
    }

}
