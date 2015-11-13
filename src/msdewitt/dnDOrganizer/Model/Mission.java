package msdewitt.dnDOrganizer.Model;

public class Mission {

	PlayerEvent events;
	NPCList npcs;
	
	public Mission(NPCList npcs, PlayerEvent events){
		this.npcs = npcs;
		this.events = events;
	}
	public NPCList getNPCs(){
		return npcs;
	}
	public PlayerEvent getEvents(){
		return events;
	}
}
