import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Pro2
 */
public class Program2 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        GridPane pane = new GridPane();
        pane.setHgap(2);
        pane.setVgap(2);
        pane.setPadding(new Insets(2));

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                TextField textField = new TextField();
                textField.setPrefColumnCount(1);
                textField.setAlignment(Pos.CENTER);
                textField.setText(String.valueOf(rand.nextInt(2)));
                pane.add(textField, i, j);
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Lab9.2 -- Program#2");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    public static void main(String[] args) {

        launch(args);
    }
}