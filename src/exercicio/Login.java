package exercicio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Login extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pan = new Pane();
		Scene scn = new Scene(pan, 450, 220);
		
		Label lblTitulo = new Label("Login no Sistema");
		pan.getChildren().add(lblTitulo);
		lblTitulo.setFont(new Font("Arial",20));
//		lblTitulo.setStyle("-fx-font-size: 20");
		lblTitulo.relocate(100, 10);
		
		Label lblLogin = new Label("User ID:");
		pan.getChildren().add(lblLogin);
		lblLogin.relocate(100, 62);
		
		TextField txtLogin = new TextField("");
		pan.getChildren().add(txtLogin);
		txtLogin.relocate(200, 60);
		
		Label lblPassword = new Label("Password:");
		pan.getChildren().add(lblPassword);
		lblPassword.relocate(100, 112);
		
		TextField txtPassword = new TextField("");
		pan.getChildren().add(txtPassword);
		txtPassword.relocate(200, 110);
		
		Button btnLogin = new Button("Login");
		pan.getChildren().add(btnLogin);
		btnLogin.relocate(100, 160);
		
		Button btnRegistration = new Button("Registration");
		pan.getChildren().add(btnRegistration);
		btnRegistration.relocate(250, 160);
		
		btnLogin.setPrefWidth(100);
		btnRegistration.setPrefWidth(100);
		
		stage.setTitle("Login de usuário");
		stage.setScene(scn);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(Login.class, args);
	}
}
