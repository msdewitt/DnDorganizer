package msdewitt.dnDOrganizer.Model;

public class NonPlayerCharacter {

	String name;
	int age;
	String gender;
	NPCStats stats;
	public NonPlayerCharacter(String name, int age, String gender, NPCStats stats){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.stats = stats;
		
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getGender(){
		return gender;
	}
	public NPCStats getStats(){
		return stats;
	}
}
