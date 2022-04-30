import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Program1 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(5));
        pane.setAlignment(Pos.CENTER);
        pane.add(new ImageView("images//uk.gif"), 0, 0);
        pane.add(new ImageView("images//canada.gif"), 0, 1);
        pane.add(new ImageView("images//china.gif"), 1, 0);
        pane.add(new ImageView("images//us.gif"), 1, 1);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Lab9.2 -- Program #1");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
