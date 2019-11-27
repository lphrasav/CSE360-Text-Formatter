//needed for panes
import java.util.ArrayList;
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
public class PrimPane {
    private TextArea errorDetails;      //for user to read formatted text
    private Button cinput, soutput, format; //choose in, save out, format
    private GridPane gridPane;          //gridpane to hold our stuff
    //
    public PrimPane(){
        //set up the pane/gui bit here
    }
    
    private class ButtonHandler2 implements EventHandler<ActionEvent> {
        //Override the abstact method handle()

        public void handle(ActionEvent e) {
            //handle our buttons
        }
    }
}
