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
		for(int i=0; i < classMeetingsList.size(); i++){
			//checks to see if the meeting already exists in the list
			ClassMeeting tempMeeting = classMeetingsList.get(i);
			if(tempMeeting.getDay().equals(classMeeting.getDay()) &&
					tempMeeting.getBldg().equals(classMeeting.getBldg()) &&
					tempMeeting.getRoom().equals(classMeeting.getRoom()) &&
					tempMeeting.getPeriodBegin().equals(classMeeting.getPeriodBegin()) &&
					tempMeeting.getPeriodEnd().equals(classMeeting.getPeriodEnd())){
				return;
			}
		}
		classMeetingsList.add(classMeeting);
	}
	
}
