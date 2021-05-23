package Question;

public class Main {
	public static void main(String[] args) {
		QuestionBuilder builder = QuestionBuilder.getInstance();
		builder.add(new TrueFalse("tf1", 5, 2));
		builder.add(new MultipleChoice("mc1", 5, 3));
		builder.add(new MultipleResponse("mr1", 5, 2));
		builder.getInstance().showAll();
	}
}
