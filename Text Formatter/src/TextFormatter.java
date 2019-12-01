//needed for gui
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;
import java.util.ArrayList;
//end needed

import java.util.*;

public class TextFormatter extends Application
{
    private TabPane tabPane;
    private ErrPane errPane;
    private PrimPane primPane;
    
    public void start(Stage stage)
    {
        StackPane root = new StackPane();
        PrimPane prim = new PrimPane();
 	ErrPane error = new ErrPane();
        tabPane = new TabPane();
        Tab tab1 = new Tab();
        tab1.setText("Input Pane");
        tab1.setContent(prim);
        Tab tab2 = new Tab();
        tab2.setText("Error Pane");
        tab2.setContent(error);
        tabPane.getSelectionModel().select(0);
        tabPane.getTabs().addAll(tab1, tab2);

        root.getChildren().add(tabPane);
        
        Scene scene = new Scene(root, 900, 800);
        stage.setTitle("Text Formatter");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main (String[] args)
    {
        launch(args);

    }// end of main
}// end of TextFormatter class
