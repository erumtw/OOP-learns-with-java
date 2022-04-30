import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.geometry.Pos;

public class Program3 extends Application {
    @Override
    public void start(Stage primaryStage) {
        // TODO Auto-generated method stub
        ClockPane clock = new ClockPane((int)(Math.random() * 12), ((int)(Math.random() * 2) == 1 ? 30 : 0), 0);;
        clock.setSecHandVisible(false);

        String timeString = clock.getHr() + ":" + clock.getMin() + ":" + clock.getSec();
        BorderPane pane = new BorderPane();
        Label timeText = new Label();
        timeText.setText(timeString); 

        //pane.getChildren().addAll(clock, timeText);
        pane.setCenter(clock);
        pane.setBottom(timeText);
        BorderPane.setAlignment(timeText, Pos.BOTTOM_CENTER);

        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("Program #3 - 64011013");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
