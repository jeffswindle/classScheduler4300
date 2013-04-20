package helper;

import java.util.ArrayList;

public class ClassSection {

	private int callNumber;
	private ArrayList<ClassMeeting> classMeetingsList;
	
	public ClassSection(int callNumber) {
		this.callNumber = callNumber;
		classMeetingsList = new ArrayList<ClassMeeting>();
	}

	public int getCallNumber() {
		return callNumber;
	}

	public void setCallNumber(int callNumber) {
		this.callNumber = callNumber;
	}

	public ArrayList<ClassMeeting> getClassMeetingsList() {
		return classMeetingsList;
	}
	
	public void addClassMeetingList(ClassMeeting classMeeting){
		classMeetingsList.add(classMeeting);
	}
	
}
