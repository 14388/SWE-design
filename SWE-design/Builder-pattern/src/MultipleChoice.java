package Question;

public class MultipleChoice extends Question {

	public MultipleChoice(String questionid, float point,int rightAnswers ) {
		super(questionid, point,rightAnswers);
	
	}
@Override
public void questionType() {
	System.out.println("Multiple Choice QuestionID:" + questionid);
}
}
