package application.controller;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements EventHandler<ActionEvent> {

	@FXML private Button loginButton = new Button();
	@FXML private TextField userName = new TextField();
	@FXML private PasswordField passWord = new PasswordField();
	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	public void handleLogin(ActionEvent event) {
		
		//System.out.print("hello");
	}
	
	



}