import java.util.ArrayList;
import java.util.List;

public class exam {
    private List<question> questions;
    private List<answerSet> answerSets = new ArrayList<>();

    private exam(examBuilder builder) {
        this.questions = builder.questions;
    }

    public void printAll() {
        for (question question : questions) {
            System.out.println(question.getId() + " " + question.getTitle() + " " + question.getType() + " " + question.getPoint());
            for (option option : question.getOptions())
                System.out.println(option.getOptionId() + " " + option.getContent() + " " + option.getTof());
        }
    }

    public void addAnwserSet(answerSet answerSet) {
        this.answerSets.add(answerSet);
    }

    public void calculateAllStudentScore() {
        for (answerSet answerSet : answerSets) {
            float score = 0;
            for (question question : questions) {
                score += calculateQuestionScore(question, answerSet);
            }
            System.out.println("Student Name: " + answerSet.getStudentName() + "\nScore: " + score);
        }
    }

    public float calculateQuestionScore(question question, answerSet answerSet) {

        if (question.getType().equals("TF")) {
            for (option option : question.getOptions()) {
                boolean answerRight = false;
                for (answer answer : answerSet.getAnswers()) {
                    if (answer.getQuestionId() == question.getId() && answer.getOptionId() == option.getOptionId()) {
                        if (answer.getTof() == option.getTof()) answerRight = true;
                        else {
                            answerRight = false;
                            break;
                        }
                    }
                }
                if (answerRight == false) return 0;
            }
            return question.getPoint();
        }

        if (question.getType().equals("MC")) {
            boolean rightAnswer = false;
            for (answer answer : answerSet.getAnswers()) {
                for (option option : question.getOptions()) {
                    if (answer.getQuestionId() == question.getId() && answer.getOptionId() == option.getOptionId()) {
                        if (answer.getTof() == option.getTof()) rightAnswer = true;
                        else {
                            rightAnswer = false;
                            if (rightAnswer == false) return 0;
                        }
                    }
                }
            }
            if (rightAnswer == false) return 0;
            return question.getPoint();
        }

        if (question.getType().equals("MR")) {
            for (option option : question.getOptions()) {
                boolean rightAnswer = false;
                if (option.getTof() == true)  rightAnswer = true;
                for (answer answer : answerSet.getAnswers()) {
                    if (answer.getQuestionId() == question.getId() && answer.getOptionId() == option.getOptionId()) {
                        if (answer.getTof() == option.getTof()) rightAnswer = false;
                        else return 0;
                    }
                }
                if (rightAnswer == true) return 0;
            }
            return question.getPoint();
        }

        return 0;
    }
/////////////////////////////////////////////////////////////////////////////
    public static class examBuilder {
        private List<question> questions = new ArrayList<>();

        public examBuilder() {
        }

        public examBuilder addQuestion(question question) {
            this.questions.add(question);
            return this;
        }

        public exam build() {
            return new exam(this);
        }
    }
}
