package msdewitt.dnDOrganizer.View;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CampainInterface extends Application{
	
	GridPane primaryPane = new GridPane();

	public static void main(String[]args){
		Application.launch(CampainInterface.class, args);
	}
	
	public void start(Stage primaryStage){
		configure(primaryStage);
		primaryStage.show();
	}

	private void configure(Stage primaryStage) {
		primaryStage.setTitle("Dungeons and Dragons Organizer");
		primaryStage.setScene(new Scene(primaryPane));
		
	}
}
