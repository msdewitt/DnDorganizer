package msdewitt.dnDOrganizer.Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CampainBuilder {
	static NPCStats stats = new NPCStats(11,10,14,13,16,17);
	static NonPlayerCharacter npc = new NonPlayerCharacter("Jerry", 20, "Male", stats);
	static NPCList npcList = new NPCList(npc);
	static PlayerEvent storyEvent = new PlayerEvent("Zuriel boss fight", 7);
	static Mission mission = new Mission(npcList,storyEvent);
	static MissionList missions = new MissionList(mission);
	static Location location = new Location("The nine layers of hell");
	static Quest hellQuest = new Quest("Hell Quest", location, missions);
	QuestList quests = new QuestList(hellQuest);
	Campain hellCampain = new Campain(quests, "Hell Campain");

	public static void main(String[] args) {
		
		getQuestName();

	
	}
	public static String getQuestName(){
		npc = setNPC();
		String value = hellQuest.getName();
		System.out.println("Quest: "+value +  "\nLocated in: " +location.getName() + "\nStoryEvent: "//
				+ storyEvent.getName() + "\nNPC: " + "Name: " + npc.getName() + "\nAge: " + npc.getAge() + "\nGender: " //
				+ npc.getGender() +"\nCharisma: "+ npc.getStats().getConstitution());
		question();
		return value;
	}
//	InputStreamReader is = new InputStreamReader(System.in);
//	   BufferedReader br = new BufferedReader(is);
	
	public static  NonPlayerCharacter setNPC(){
		InputStreamReader is1= new InputStreamReader(System.in);
		InputStreamReader is2 = new InputStreamReader(System.in);
		InputStreamReader is3 = new InputStreamReader(System.in);
		System.out.println("Name:");
		BufferedReader characterName = new BufferedReader(is1);
		System.out.println("Age:");
		BufferedReader characterAge = new BufferedReader(is2);
		System.out.println("Gender");
		BufferedReader characterGender = new BufferedReader(is3);
		String name = "";
		try {
			name = characterName.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		int age = 0;
		try {
			age = characterAge.read();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		String gender = "";
		try {
			gender = characterGender.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		NonPlayerCharacter npc = new NonPlayerCharacter(name, age, gender, stats);
		return npc;
	}
	public static void question(){
		System.out.println("Would you like to edit the NPC?");
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader answer = new BufferedReader(is);
		try {
			if (answer.readLine() =="Yes"){
				npc = setNPC();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
