package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
/**
 * Main that controls the start of the entire application. It will set the stage
 * and launch the application.
 * 
 * @author 
 *
 */
public class Main extends Application {
	
	public static Stage stage;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("view/Login.fxml"));
			primaryStage.setScene(new Scene(root, 600, 600));
			primaryStage.show();
			stage = primaryStage;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}