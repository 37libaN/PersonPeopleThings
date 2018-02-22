package personStuff;

public class Schedule {
	private String[] scheduleMeetings;

	public Schedule() {
		scheduleMeetings = new String[5];
		for (int count = 0; count < scheduleMeetings.length; count++) {
			scheduleMeetings[count] = "AHOisufgso f";
		}
	}

	public String mySchedule() {
		String schedule = "";
		for (String lob : scheduleMeetings) {
			schedule += lob + "\n";
		}
		return schedule;
	}

	public static void main(String[] args) {
		Schedule blob = new Schedule();
		System.out.println(blob.mySchedule());
	}
}