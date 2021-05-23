import java.util.ArrayList;
import java.util.List;

public class exam {
    private List<question> questions;

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
/////////////////////////////////////////////////////////////////////////////
    public static class examBuilder {
        List<question> questions = new ArrayList<>();

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
