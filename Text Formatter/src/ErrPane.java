//needed for panes
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
//needed for panes

/*
// uses code from an assignment about laptops which required a gui.
*/
public class ErrPane extends HBox {
    private TextArea errorDetails;      //for user to read errors
    private Button clear;               //clears errors
    private GridPane gridPane;          //gridpane to hold errors and button
    //
    public ErrPane(){
        errorDetails = new TextArea();
        errorDetails.setWrapText(true);
        errorDetails.setText("Nothing");
        // input and output buttons and text fields
        clear = new Button("Clear Errors");  //does what it says
        gridPane = new GridPane();
        GridPane.setConstraints(clear, 1, 1, 1, 1); //top left
        GridPane.setConstraints(errorDetails, 2, 1, 1, 50); //all right side
        gridPane.setHgap(10);   //gap between columns - semi-arbitrary
        gridPane.setVgap(10);
        //set up the pane/gui bit here
        gridPane.getChildren().addAll(clear, errorDetails);
        //adds the left and right side of the input pane information and text
        //fields to our inputpane proper.
        this.getChildren().add(gridPane); //set to our HBox
    }
    
    private class ButtonHandler2 implements EventHandler<ActionEvent> {
        //Override the abstact method handle()

        public void handle(ActionEvent e) {
            //handle our button
        }
    }
    
}
