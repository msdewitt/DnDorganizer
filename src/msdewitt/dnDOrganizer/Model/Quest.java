package msdewitt.dnDOrganizer.Model;

public class Quest {
	String name;
	Location location;
	MissionList missions;
	
	public Quest(String name, Location location, MissionList missions){
		this.name = name;
		this.location = location;
		this.missions = missions;
	}
	public Location getLocation(){
		return location;
	}
	public String getName(){
		return name;
	}
	public MissionList getMissions(){
		return missions;
	}
}
