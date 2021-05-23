package Question;

public class TrueFalse extends Question {
	public TrueFalse(String questionid, float point, int rightAnswers) {
		super(questionid, point, rightAnswers);
	}

	@Override
	public void questionType() {
		System.out.println("TrueFalse QuestionID:" + questionid);
	}
}
