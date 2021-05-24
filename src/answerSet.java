import java.util.ArrayList;
import java.util.List;

public class answerSet {
    private String studentName;
    private List<answer> answers;

    public String getStudentName() {
        return this.studentName;
    }

    public List<answer> getAnswers() {
        return answers;
    }

    private answerSet(answerSetBuilder builder) {
        this.answers = builder.answers;
        this.studentName = builder.studentName;
    }

    public static class answerSetBuilder {
        private String studentName;
        private List<answer> answers = new ArrayList<>();

        public answerSetBuilder(String studentName) {
            this.studentName = studentName;
        }

        public answerSetBuilder addAnswer(int questionId, int optionId, boolean tof) {
            this.answers.add(new answer(questionId, optionId, tof));
            return this;
        }

        public answerSet build() {
            return new answerSet(this);
        }
    }
}
