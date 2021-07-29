package dd;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class BizMeeting extends Meeting {
	static String topic;

	public String getTopic() {
		return topic;
	}

	public BizMeeting(String topic, String place, ArrayList<String> attendee,
			LocalDateTime meetingTime) {
		super();
		this.topic = topic;
		this.place = place;
		this.attendee = attendee;
		this.meetingTime = meetingTime;
	}
	
	public String toString() {
		return "업무회의.	주제: " + getTopic() + "\n\t" +super.toString();
	}
	public static void main(String[] args) {
		MemberList<String> emailList = new MemberList<String>(s -> s.contains("@"));
		emailList.add("abc@naver.com");
		emailList.add("def@gmail.com");
		emailList.add("hij@hanmail.net");
		emailList.add("asd$korea.net");

		var marketingMeeting = new BizMeeting("마케팅 방법 개선", "서울역 회의실", emailList,
				LocalDateTime.of(2021, 07, 29, 9, 30));
		System.out.println(marketingMeeting);
	}
}