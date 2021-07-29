package dd;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public abstract class Meeting {
	static String place;
	LocalDateTime meetingTime;
	public static ArrayList<String> attendee;
	
	public String getPlace() {
		return place;
	}
	
	public String getMeetingTime() {
		return DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm").format(meetingTime);
	}
	
	public String toString() {
		StringBuffer a = new StringBuffer();
		attendee.forEach((attendees)->{a.append("\n\t\t" + attendees);});
		return " ["+ "장소=" + getPlace() +
				"\n\t시간=" + getMeetingTime() +
				"\n\t참석자 이메일=" + a + "]";
	}
}
