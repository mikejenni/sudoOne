package ch.test.myjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MyFxApp extends Application {

   /* public static final String PROJECT_PATH = "file:///C:/Users/Micha/repo udemy/JavaFXtest201105";
    public static final String LAYOUT_PATH = "src/main/java/ch/test/myjavafx/myLayout.fxml";

   @Override
      public void start(Stage primaryStage) throws Exception {
        MyFxController controller = new MyFxController();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL(PROJECT_PATH + LAYOUT_PATH));
        loader.setController(controller);
        VBox root = loader.load();
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setTitle("Exercise1");
        primaryStage.setScene(scene);   
        primaryStage.show();
    }*/
   private static Stage primaryStage;
    private static BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) throws Exception {
        MyFxApp.primaryStage = primaryStage;
        MyFxApp.primaryStage.setTitle("Puzzle Solver");
        //MyFxApp.primaryStage.getIcons().add(new Image(String.valueOf(PuzzleApp.class.getResource("/images/puzzleAppIcon.png"))));
        initRootLayout();
    }
    public void initRootLayout() throws IOException {
        try {
            //rootLayout = (BorderPane) loadFXML("RootLayout");
            rootLayout = (BorderPane) MyFXMLLoader.loadFXML("myLayout", "test");
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // private void initSudoku() throws IOException {
//    SudokuController sudokuController = new SudokuController();
//    sudokuController.setSudokuToBoarderPaneCenter();
// }
    public static void main(String[] args) {
        launch(args);
    }
}
