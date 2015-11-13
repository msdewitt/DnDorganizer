package msdewitt.dnDOrganizer.View;


import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import msdewitt.dnDOrganizer.Model.NonPlayerCharacter;

public class nPCInterface {
	
	private static final double INSETS = 20;
	NonPlayerCharacter npc;

	public nPCInterface(NonPlayerCharacter npc){
		this.npc = npc;
		
	}
	public GridPane buildNPC() {
		GridPane pane = new GridPane();
		Insets insets = new Insets(INSETS,INSETS,INSETS,INSETS);
		Label nPCInfo = new Label("Name: " + npc.getName() + "\nAge: "+ //
		String.valueOf(npc.getAge()) + "\nGender: " + npc.getGender());
		pane.add(nPCInfo,0,0);
		buildStats(pane);
		pane.setPadding(insets);
		return pane;
	}
	private void buildStats(GridPane pane) {
		Label npcStats = new Label("Str: " + String.valueOf(npc.getStats().getStrength()) + " " + //
				String.valueOf("Dex: " + npc.getStats().getDexterity()) + " "+ //
				String.valueOf("Con: " + npc.getStats().getConstitution()) + "\n" +//
				String.valueOf("Wis: " + npc.getStats().getWisdom())+ " " + //
				String.valueOf("Int: " + npc.getStats().getIntelligence()) + " " + //
				String.valueOf("Cha: " + npc.getStats().getCharisma()));
		pane.add(npcStats, 0, 1);

		
	}
}
