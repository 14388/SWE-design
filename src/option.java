public class option {
    private int optionId;
    private String content;
    private boolean tof;

    public option (int optionId, String content, boolean tof) {
        this.content = content;
        this.tof = tof;
        this.optionId = optionId;
    }

    public String getContent() {
        return content;
    }

    public boolean getTof() {
        return tof;
    }

    public int getOptionId() {
        return optionId;
    }
}
