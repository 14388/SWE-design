import java.util.List;

public class answer {
    private int questionId;
    private int optionId;
    private boolean tof;

    public answer(int questionId, int optionId, boolean tof) {
        this.questionId = questionId;
        this.optionId = optionId;
        this.tof = tof;
    }

    public int getQuestionId() {
        return questionId;
    }

    public int getOptionId() {
        return optionId;
    }

    public boolean getTof() {
        return tof;
    }
}
