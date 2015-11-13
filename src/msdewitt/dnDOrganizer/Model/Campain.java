package msdewitt.dnDOrganizer.Model;

public class Campain {

	String campainName;
	QuestList quests;
	
	public Campain(QuestList quests, String name){
		this.campainName = name;
		this.quests = quests;
	}
	public String getCampainName(){
		return campainName;
	}
	public QuestList getQuests(){
		return quests;
	}
}
