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

public class ErrPane extends HBox {
    private TextArea errorDetails;      //for user to read errors
    private Button clear;               //clears errors
    private GridPane gridPane;          //gridpane to hold errors and button
    //
    public ErrPane(){
        //set up the pane/gui bit here
    }
    
    private class ButtonHandler2 implements EventHandler<ActionEvent> {
        //Override the abstact method handle()

        public void handle(ActionEvent e) {
            //handle our button
        }
    }
    
}
