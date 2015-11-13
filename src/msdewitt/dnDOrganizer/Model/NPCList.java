package msdewitt.dnDOrganizer.Model;

import java.util.ArrayList;

public class NPCList {

	NonPlayerCharacter npc;
	
	public NPCList(NonPlayerCharacter npc){
		this.npc = npc;
		ArrayList<NonPlayerCharacter> list = new ArrayList<NonPlayerCharacter>();
		list.add(npc);
		//make a list of all the npcs
	}
}
