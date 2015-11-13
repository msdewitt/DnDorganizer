package msdewitt.dnDOrganizer.Model;

import java.util.ArrayList;

public class NPCList {
	
	static ArrayList<NonPlayerCharacter> list = new ArrayList<NonPlayerCharacter>();
	NonPlayerCharacter npc;
	
	public NPCList(NonPlayerCharacter npc){
		this.npc = npc;
		list.add(npc);
		//make a list of all the npcs
	}

	public static int getLength() {
		System.out.println(list.size());
		return list.size();
	}
}
