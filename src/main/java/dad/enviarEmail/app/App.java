package dad.enviarEmail.app;

import dad.enviarEmail.controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private Controller controller = new Controller();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(controller.getView());
		
		primaryStage.setTitle("EnviarEmail");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
