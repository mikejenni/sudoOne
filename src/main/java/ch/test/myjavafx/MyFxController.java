package ch.test.myjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Date;

public class MyFxController {
    @FXML
    private Button darkMode;
    @FXML
    private Button load;
    @FXML
    private Button solve;
    @FXML
    private Button reset;
    @FXML
    private BorderPane borderPane;
    public MyFxController() {
        System.out.println("RootController init");
    }
    @FXML
    private void handleNewSudokuAction(ActionEvent event) throws IOException {
        AnchorPane newSudoku = (AnchorPane) MyFXMLLoader.loadFXML("Sudoku", "firstSudoku");
        borderPane.setCenter(newSudoku);
        borderPane.autosize();
    }
    @FXML
    private void handleNewBimaruAction(ActionEvent event) throws IOException {
        System.out.println("new bimaru was pressed");
    }
    @FXML
    private void handleDarkModeAction(ActionEvent event) throws IOException {
        System.out.println("darkMode was pressed");
    }
    @FXML
    private void handleLoadAction(ActionEvent event) throws IOException {
        System.out.println("load was pressed");
    }
    @FXML
    private void handleSolveAction(ActionEvent event) throws IOException {
        System.out.println("solve was pressed");
    }
    @FXML
    private void handleResetAction(ActionEvent event) throws IOException {
        System.out.println("reset was pressed");
    }
}

