public class main {
    public static void main(String[] args) {
        exam test = new exam.examBuilder()
                .addQuestion(new question.questionBuilder(1, "Xin chao?", "MR", 3)
                        .addOption(0, "hi", true)
                        .addOption(1, "hello", true)
                        .addOption(2, "bye", false)
                        .build())
                .addQuestion(new question.questionBuilder(2, "Mat troi?", "MC", 3)
                        .addOption(0, "sun", true)
                        .addOption(1, "moon", false)
                        .addOption(2, "earth", false)
                        .build())
                .build();
        test.printAll();

        test.addAnwserSet(new answerSet.answerSetBuilder()
                .addAnswer(1, 0 , true)
                .addAnswer(1, 1, true)
                .addAnswer(2, 0, true)
                .build());
    }
}
