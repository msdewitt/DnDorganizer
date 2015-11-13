package msdewitt.dnDOrganizer.View;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import msdewitt.dnDOrganizer.Model.NPCStats;
import msdewitt.dnDOrganizer.Model.NonPlayerCharacter;

public class CampainInterface extends Application{
	
	GridPane primaryPane = new GridPane();
	NPCStats stats = new NPCStats(11,10,14,13,16,17);
	NonPlayerCharacter npc = new NonPlayerCharacter("Jerry", 20, "Male", stats);
	nPCInterface npcView = new nPCInterface(npc);

	public static void main(String[]args){
		Application.launch(CampainInterface.class, args);
	}
	
	public void start(Stage primaryStage){
		configure(primaryStage);
		primaryPane.add(npcView.buildInterface(), 0, 1);
		primaryStage.show();
	}

	private void configure(Stage primaryStage) {
		primaryStage.setTitle("Dungeons and Dragons Organizer");
		primaryStage.setScene(new Scene(primaryPane));
		
	}
}
