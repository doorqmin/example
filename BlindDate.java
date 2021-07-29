package dd;

import java.time.LocalDateTime;
import java.util.ArrayList;
import org.apache.commons.lang3.RandomStringUtils;

public class BlindDate extends Meeting{

	public BlindDate(String mainName, String place, LocalDateTime meetingTime, ArrayList<String> attendee) {
		super();
		this.mainName = mainName;
		this.place = place;
		this.meetingTime = meetingTime;
		this.attendee = attendee;
	}

	public static void main(String[] args) {
		MemberList<String> phoneNumList = new MemberList<String>(s -> s.startsWith("010"));

		for (int i = 0; i < 3; i++) {
			String a = RandomStringUtils.randomNumeric(8);
			phoneNumList.add("010" + a);
		}
		String a = RandomStringUtils.randomNumeric(8);
		phoneNumList.add("011" + a);
		var meeting = new BlindDate("사교만남", "강남 칵테일바", LocalDateTime.of(2021, 07, 29, 9, 30), phoneNumList);
		System.out.println(meeting);
	}
}