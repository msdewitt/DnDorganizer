package msdewitt.dnDOrganizer.Model;

import java.util.ArrayList;

public class MissionList {

	Mission mission;
	public MissionList(Mission mission){
		this.mission = mission;
		ArrayList<Mission> list = new ArrayList<Mission>();
		list.add(mission);
	}
}
