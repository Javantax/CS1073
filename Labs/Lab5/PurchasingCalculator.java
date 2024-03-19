import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import java.text.NumberFormat;

/**
This class represents a javadoc application for calculating purchasing cost with tax
@author Daniyal Khan 3765942
*/

public class PurchasingCalculator extends Application {
    private TextField unitPriceInput;
    private TextField quantityInput;
    private Text info;
    private Text subtotal;
    private Text salesTax;
    private Text total;
    private NumberFormat amount;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage Stage) {
        Stage.setTitle("Purchasing Calculator");

        Text unitPrice = new Text("Unit Price:");
        unitPriceInput = new TextField();
	unitPriceInput.setPrefWidth(110);
	
        Text quantity = new Text("Quantity:");
        quantityInput = new TextField();
	quantityInput.setPrefWidth(110);
	
        Button calculate = new Button("Calculate");
        Button clear = new Button("Clear");

        calculate.setOnAction(this::calculate);
        clear.setOnAction(this::clear);
         
        info = new Text("Enter the purchase information.");
        subtotal = new Text("Purchase Subtotal:");
        salesTax = new Text("New Brunswick Sales Tax:");
        total = new Text("Purchase Total:");        
        
        FlowPane pane = new FlowPane(unitPrice, unitPriceInput, quantity, quantityInput, calculate, clear, info, 					     subtotal, salesTax, total);
        pane.setAlignment(Pos.CENTER);
        pane.setVgap(20);
        pane.setHgap(20);
        
        Scene scene = new Scene(pane, 260, 300);
       	Stage.setScene(scene);
        Stage.show();
    }
    
    public void calculate(ActionEvent event) {
    	amount = NumberFormat.getCurrencyInstance();
    	
       	String unitPrice = unitPriceInput.getText();
        String quantity = quantityInput.getText();
      
        double priceIn = Double.parseDouble(unitPrice);
        double quantityIn = Double.parseDouble(quantity);
       	double salesTaxNB = (double)15/100;
       	
       	double subTotalPrice = priceIn*quantityIn;
       	double newBrunswickTax = salesTaxNB*subTotalPrice;
       	double totalPrice = subTotalPrice + newBrunswickTax;
       	
       	info.setText("Purchase Cost Breakdown:" );
       	subtotal.setText("Purchase Subtotal: " + amount.format(subTotalPrice));
        salesTax.setText("New Brunswick Sales Tax: " + amount.format(newBrunswickTax));
        total.setText("Purchase Total: " + amount.format(totalPrice)); 	
    }
    
    public void clear(ActionEvent event) {
    	unitPriceInput.clear();
    	quantityInput.clear();
    	info.setText("Enter the purchase information" );
       	subtotal.setText("Purchase Subtotal:");
        salesTax.setText("New Brunswick Sales Tax:");
        total.setText("Purchase Total:"); 
    }
}
