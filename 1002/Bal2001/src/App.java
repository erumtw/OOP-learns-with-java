import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    private Loan loan = new Loan();
    File file = new File("LoanData.dat");

    private TextField tfAnnulInterestRate = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthlyPaymant = new TextField();
    private TextField tfTotalPayment = new TextField() ;

    private Button btSave = new Button("Save");
    private Button btLoad = new Button("Load");
    private Button btClear = new Button("Clear");
    private Button btCaculate = new Button("Calculate");

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        tfAnnulInterestRate.setAlignment(Pos.CENTER_RIGHT);
        tfLoanAmount.setAlignment(Pos.CENTER_RIGHT);
        tfNumberOfYears.setAlignment(Pos.CENTER_RIGHT);
        tfMonthlyPaymant.setAlignment(Pos.CENTER_RIGHT);
        tfTotalPayment.setAlignment(Pos.CENTER_RIGHT);

        HBox saveNload = new HBox(10);
        saveNload.getChildren().addAll(btSave, btLoad);
        HBox  clearNcal = new HBox(10);
        clearNcal.getChildren().addAll(btClear, btCaculate);

        HBox buttonBar = new HBox(51);
        buttonBar.getChildren().addAll(saveNload, clearNcal);
        buttonBar.setAlignment(Pos.CENTER);

        GridPane gPane = new GridPane();
        gPane.setPadding(new Insets(10));
        gPane.setHgap(8);
        gPane.setVgap(5);
        gPane.add(new Label("Annual Interest Rate"), 0, 0);
        gPane.add(tfAnnulInterestRate, 1, 0);
        gPane.add(new Label("Number Of Years"), 0, 1);
        gPane.add(tfNumberOfYears, 1, 1);
        gPane.add(new Label("Loan Amount"), 0, 2);
        gPane.add(tfLoanAmount, 1, 2);
        gPane.add(new Label("Monthly Paymant"), 0, 3);
        gPane.add(tfMonthlyPaymant, 1, 3);
        gPane.add(new Label("Total Payment"), 0, 4);
        gPane.add(tfTotalPayment, 1, 4);
        gPane.setAlignment(Pos.CENTER);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(gPane, buttonBar);
        vBox.setPadding(new Insets(8));

        btCaculate.setOnAction(e -> {
            calculate();
        });

        btClear.setOnAction(e -> {
            clear();
        });

        btSave.setOnAction(e -> {
            save();
        });

        btLoad.setOnAction(e -> {
            load();
        });
        Scene scene = new Scene(vBox, 350, 220);
        primaryStage.setTitle("Loan Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void calculate() {
        loan.setAnnualInterestRate(Double.parseDouble(tfAnnulInterestRate.getText()) );
        loan.setNumberOfYears(Integer.parseInt(tfNumberOfYears.getText()));
        loan.setLoanAmount(Double.parseDouble(tfLoanAmount.getText()));

        tfMonthlyPaymant.setText(String.format("$%.2f", loan.getMonthlyPayment()));
        tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));
    }
    
    //clear all 
    private void clear(){
        tfAnnulInterestRate.clear();
        tfLoanAmount.clear();
        tfNumberOfYears.clear();
        tfMonthlyPaymant.clear();
        tfTotalPayment.clear();
    }

    //save data to binary
    private void save() {

        calculate();
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file))) {
            output.writeObject(loan);
            warnUser("Saved");

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //load data from binary
    private void load() {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            this.loan = (Loan)input.readObject();

            tfAnnulInterestRate.setText(loan.getAnnualInterestRate() + ""); // turn into String
            tfLoanAmount.setText(String.format("%.0f", loan.getLoanAmount())); //another method turn into String
            tfNumberOfYears.setText(String.format("%d", loan.getNumberOfYears()));
        
            calculate();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    
    public void warnUser(String message) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) throws Exception{
        launch(args);
    }
}
