package msdewitt.dnDOrganizer.Model;

public class PlayerEvent {

	String name;
	int difficulty; //1 to 10
	
	public PlayerEvent(String name, int difficulty){
		this.name = name;
		this.difficulty = difficulty;
	}
	public String getName(){
		return name;
	}
	public int getDifficulty(){
		return difficulty;
	}
}
