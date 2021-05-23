package Question;

public class MultipleResponse extends Question {

	public MultipleResponse(String questionid, float point, int rightAnswers) {
		super(questionid, point, rightAnswers);
	}

	@Override
	public void questionType() {
		System.out.println("Multiple Response QuestionID:" + questionid);
	}
}
