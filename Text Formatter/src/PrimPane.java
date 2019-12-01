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
import java.io.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
//needed for panes

/*
// uses code from an assignment about laptops which required a gui.
*/
public class PrimPane extends HBox {
    private TextArea outputDetails;      //for user to read formatted text
    private Button cinput, soutput, format; //choose in, save out, format
    private TextField inTF, outTF;
    private GridPane gridPane;          //gridpane to hold our stuff
    private FileChooser fileC;
    private File inFile, outFile;
    //
    public PrimPane(){
        //file chooser
        //set up the pane/gui bit here
        //first text area
        fileC = new FileChooser();
        fileC.setTitle("Choose File");
        outputDetails = new TextArea();
        outputDetails.setWrapText(true);
        outputDetails.setEditable(false);
        outputDetails.setText("");
        // input and output buttons and text fields
        cinput = new Button("Input File");  //calls file picker
        inTF = new TextField();             //shows name of file
        inTF.setEditable(false);
        soutput = new Button("Save File");  //calls file saver
        outTF = new TextField();             //input for name to save as
        format = new Button("Format File");
        cinput.setOnAction(new ButtonHandler());
        soutput.setOnAction(new ButtonHandler());
        format.setOnAction(new ButtonHandler());
        
        // etc
        //gridpane to hold it up
        gridPane = new GridPane();

        gridPane.setHgap(10);   //gap between columns - semi-arbitrary
        gridPane.setVgap(10);
        //set input button to right of text field - col 0/2, row 1
        GridPane.setConstraints(inTF, 1, 1, 1, 1);
        GridPane.setConstraints(cinput, 2, 1, 1, 1);
        //set output button to right of text field - col 0/1, row 2
        GridPane.setConstraints(outTF, 1, 2, 1, 1);
        GridPane.setConstraints(soutput, 2, 2, 1, 1);
        //set format button to below above things - col 1, row 3
        GridPane.setConstraints(format, 2, 3, 1, 1);
        //set output details to column 3 row 1, size of 1 columns 50 rows
        GridPane.setConstraints(outputDetails, 3, 1, 1, 50);
        
        //add everything to GridPane [important]
        //using method described in javadocs
        gridPane.getChildren().addAll(inTF, cinput, outTF, soutput, format, outputDetails);
        //adds the left and right side of the input pane information and text
        //fields to our inputpane proper
        this.getChildren().add(gridPane); //set to our HBox
    }
    
    private class ButtonHandler implements EventHandler<ActionEvent> {
        //Override the abstact method handle()

        @Override
        public void handle(ActionEvent e) {
            //handle our buttons
            //outputDetails.setText("handle works");
            if (e.getSource() == cinput){
                //get input
                inFile = fileC.showOpenDialog(new Stage()); //gets file
                if (inFile != null){
                    inTF.setText(inFile.getName());
                } else {
                    inTF.setText("File Not Opened");
                }
                
            } else if (e.getSource() == soutput){
                //save output
                //set outFile equal to a new file
                //write contents of outputDetails to it
                //save
                //save where? - can we alter save location?
                //may need to default to textformatter location
            } else if (e.getSource() == format){
                //activate format function
                //will call something else to do the actual hard work
                //whatever does will keep track of errors and actual output
                //and set text of output here
                //and return errors with TextFormatter's setErr function
            }
        }
    }
}
