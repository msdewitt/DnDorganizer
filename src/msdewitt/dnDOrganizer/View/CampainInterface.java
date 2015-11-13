package msdewitt.dnDOrganizer.View;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import msdewitt.dnDOrganizer.Model.NPCList;
import msdewitt.dnDOrganizer.Model.NPCStats;
import msdewitt.dnDOrganizer.Model.NonPlayerCharacter;

public class CampainInterface extends Application{
	
	BorderPane primaryPane = new BorderPane();
	NPCStats stats = new NPCStats(11,10,14,13,16,17);
	NonPlayerCharacter npc = new NonPlayerCharacter("Jerry", 20, "Male", stats);
	nPCInterface npcView = new nPCInterface(npc);
	npcListView npcListView = new npcListView(npcView, new NPCList(npc));
	FlowPane npcPane = npcListView.buildInterface();

	


	public static void main(String[]args){
		Application.launch(CampainInterface.class, args);
	}
	
	public void start(Stage primaryStage){
		Button button = new Button();
		ToolBar toolBar = new ToolBar(button);
		configure(primaryStage);
		button.setText("List of NPC's");
		primaryPane.setPrefSize(400.0, 300.0);
		primaryPane.setTop(toolBar);
		button.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
			Button closeButton = new Button();
			closeButton.setText("Close");
			primaryPane.setCenter(npcPane);
			primaryPane.setBottom(closeButton);
			closeButton.setOnAction(new EventHandler<ActionEvent>(){

				@Override
				public void handle(ActionEvent event) {
					primaryPane.getChildren().remove(closeButton);
					primaryPane.getChildren().remove(npcPane);
				}
			});
			}
			
		});
		primaryStage.show();
	}

	private void configure(Stage primaryStage) {
		primaryStage.setTitle("Dungeons and Dragons Organizer");
		primaryStage.setScene(new Scene(primaryPane));
		
	}
}
