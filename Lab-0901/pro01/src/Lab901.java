import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Lab901 extends Application {

	protected TextField loanField = new TextField();
	protected TextField yearField = new TextField();
	protected TextArea tableArea = new TextArea();

	public BorderPane getPane() {
		Label loan = new Label("Loan Amount");
		Label year = new Label("Years");
		Button bt = new Button("Show table");

		tableArea.setPrefColumnCount(30);
		loanField.setPrefColumnCount(8);
		yearField.setPrefColumnCount(2);
		HBox paneH = new HBox(15);
		paneH.getChildren().addAll(new Label(" "), loan, loanField, year, yearField, bt, new Label(" "));
		paneH.setAlignment(Pos.CENTER);

		ScrollPane scrollPane = new ScrollPane(tableArea);
		
		BorderPane pane = new BorderPane();
		pane.setTop(paneH);
		pane.setBottom(tableArea);
		
		bt.setOnAction(e -> { 
			print();
		});

		return pane;
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene scene = new Scene(getPane());
		primaryStage.setTitle("Lab - 9.1 - 64011013");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	protected void print() {
		String out = "";

		out +=  "Interest Rate       Monthly Payment          Total Payment\n";

		for (double i = Double.parseDouble(yearField.getText()); i <= 8; i += 0.25) {
			double monthlyInterestRate = i / 1200;
			double monthlyPayment = Double.parseDouble(loanField.getText()) * 
				monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate,
				Double.parseDouble(yearField.getText()) * 12));

			out += String.format("%-24.3f%-34.2f%-8.2f\n", i, 
				monthlyPayment, (monthlyPayment * 12) * 
				Double.parseDouble(yearField.getText()));
		}

		tableArea.setText(out);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}