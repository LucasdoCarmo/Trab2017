package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lombok.Getter;

public class Main extends Application {

	// n�o tem nada aqui!!!!!!!!!!!
			
	public static final String PATH_VIEW = "../telas/";
	
	@Getter
	private static AnchorPane rootLayout;
	@Getter
	private static Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		try {
			Main.primaryStage = primaryStage;
			Main.rootLayout = (AnchorPane) FXMLLoader.load(getClass().getResource(PATH_VIEW + "Login.fxml"));

			primaryStage.setTitle("Trab2017");
			Scene scene = new Scene(rootLayout);
			scene.getStylesheets().add("/css/style.css");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
