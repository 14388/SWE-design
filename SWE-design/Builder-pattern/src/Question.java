package Question;

public class Question {
	String questionid;
	float point;
	int rightAnswers;

	public Question(String questionid, float point, int rightAnswers) {
		this.questionid = questionid;
		this.point = point;
		this.rightAnswers = rightAnswers;
	}

	public void questionType() {

	}

	public void pointCount() {
		System.out.println("Point:" + point);
	}
}
