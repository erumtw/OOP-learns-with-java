import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class Program5 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		ArcPane arcPane = new ArcPane();

		// Create three buttons
		Button btPause = new Button("Pause");
		Button btResume = new Button("Resume");
		Button btReverse = new Button("Reverse");
		HBox hBox = new HBox(5);
		hBox.setAlignment(Pos.CENTER);

		// Place nodes in panes
		hBox.getChildren().addAll(btPause, btResume, btReverse);


		// Create a border pane
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(arcPane);
		borderPane.setBottom(hBox);

		btPause.setOnAction(e -> {
			arcPane.pause();
		});

		btResume.setOnAction(e -> {
			arcPane.play();
		});

		btReverse.setOnAction(e -> {
			arcPane.reverse();
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 250, 250);
		primaryStage.setTitle("Program#5"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		arcPane.requestFocus();
	}

    public static void main(String[] args) {
        launch(args);
    }
}