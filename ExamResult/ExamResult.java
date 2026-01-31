package ExamResult;

public class ExamResult {
	public boolean isPass(int marks) {
		if (marks > 50) {
			return true;
		}
		return false;
	}
}
