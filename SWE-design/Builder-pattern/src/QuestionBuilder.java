package Question;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuestionBuilder {
	List<Question> questionList = new ArrayList<>();
	private static QuestionBuilder instance = null;

	public static QuestionBuilder getInstance() {
		if (instance == null) {
			instance = new QuestionBuilder();
		}
		return instance;
	}

	private QuestionBuilder() {

	}

	public void add(Question question) {
		questionList.add(question);
	}

	public void showAll() {
		for (Question question : questionList) {
			question.questionType();
			question.pointCount();
		}
	}
}
