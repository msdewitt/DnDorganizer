package msdewitt.dnDOrganizer.Model;

import java.util.ArrayList;

public class QuestList {
	
	Quest quest;

	public QuestList(Quest quest){
		this.quest = quest;
		ArrayList<Quest> list = new ArrayList<Quest>();
		list.add(quest);
	}
}
