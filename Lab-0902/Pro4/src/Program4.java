import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene. Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class Program4 extends Application {
 // Create a circle and a rectangle
  private Circle circle = new Circle(60);
  private Rectangle rectangle = new Rectangle(120, 120);
 // Place clock and label in border pane
  private StackPane pane = new StackPane ();

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		circle.setFill(Color.GRAY);
		rectangle.setFill(Color.WHITE);
 		rectangle.setStroke(Color.BLACK);
 		pane.getChildren().addAll(rectangle, circle);
		Scene scene = new Scene(pane, 140, 140);
		primaryStage.setTitle("ResizableCircleRectangle");
		primaryStage.setScene(scene); // Place the scene in the stage
 		primaryStage.show();
		pane.widthProperty().addListener(ov -> resize());
		pane.heightProperty().addListener(ov -> resize());
	}

	private void resize() {
		double length = Math.min(pane.getWidth(), pane.getHeight());
		circle.setRadius(length / 2 - 15);
		rectangle.setWidth(length - 30);
		rectangle.setHeight(length - 30);
	}

	public static void main(String[] args) {
		launch(args);
	}
}