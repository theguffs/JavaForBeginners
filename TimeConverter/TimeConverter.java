package TimeConverter;

public class TimeConverter {
	public static int convertHoursToMinutes(int hours) {
		if (hours < 0) {
			return -1;
		}
		int noOfMinutes = hours * 60;
		return noOfMinutes;
	}

	public static int convertDaysToMinutes(int days) {
		if (days < 0) {
			return -1;
		}
		int noOfMinutes = days * 60 * 24;
		return noOfMinutes;
	}
}