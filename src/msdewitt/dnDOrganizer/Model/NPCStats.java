package msdewitt.dnDOrganizer.Model;

public class NPCStats {
	int strength;
	int dexterity;
	int constitution;
	int intelligence;
	int wisdom;
	int charisma;
	public NPCStats(int strength, int dexterity, //
			int constitution, int intelligence, int wisdom, int charisma){
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
	}
	public int getStrength(){
		return strength;
	}
	public int getDexterity(){
		return dexterity;
	}
	public int getConstitution(){
		return constitution;
	}
	public int getIntelligence(){
		return intelligence;
	}
	public int getWisdom(){
		return wisdom;
	}
	public int getCharisma(){
		return charisma;
	}
}
