import java.util.ArrayList;
import java.util.List;

public class answerSet {
    private List<answer> answers;

    private answerSet(answerSetBuilder builder) {
        this.answers = builder.answers;
    }

    public static class answerSetBuilder {
        List<answer> answers = new ArrayList<>();

        public answerSetBuilder() {}

        public answerSetBuilder addAnswer(int questionId, int optionId, boolean tof) {
            this.answers.add(new answer(questionId, optionId, tof));
            return this;
        }

        public answerSet build() {
            return new answerSet(this);
        }
    }
}
