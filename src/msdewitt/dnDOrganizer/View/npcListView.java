package msdewitt.dnDOrganizer.View;

import javafx.scene.layout.FlowPane;
import msdewitt.dnDOrganizer.Model.NPCList;

public class npcListView {
	nPCInterface npcView;
	NPCList list;

	public npcListView(nPCInterface npcView, NPCList list){
		this.npcView = npcView;
		this.list = list;
	}
	public FlowPane buildInterface(){
		FlowPane flowPane = new FlowPane();
		flowPane.setPrefSize(300.0, 300.0);
		for(int i=0; i< NPCList.getLength(); i++){
			flowPane.getChildren().add(npcView.buildNPC());
			System.out.println(i);
		}
		return flowPane;
	}
}
