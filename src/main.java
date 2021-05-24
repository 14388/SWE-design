public class main {
    public static void main(String[] args) {
        exam test = new exam.examBuilder()
                .addQuestion(new question.questionBuilder(1, "Xin chao?", "MR", 4)
                        .addOption(0, "hi", true)
                        .addOption(1, "hello", true)
                        .addOption(2, "bye", false)
                        .build())
                .addQuestion(new question.questionBuilder(2, "Mat troi?", "MC", 4)
                        .addOption(0, "sun", true)
                        .addOption(1, "moon", false)
                        .addOption(2, "earth", false)
                        .build())
                .addQuestion(new question.questionBuilder(3, "True or false", "TF", 3)
                        .addOption(0, "1+1=2", true)
                        .addOption(1, "moon bigger than sun", false)
                        .build())
                .build();
        test.printAll();

        test.addAnwserSet(new answerSet.answerSetBuilder("Thien")
                .addAnswer(1, 0 , true)
                .addAnswer(1, 1, true)
                .addAnswer(2, 0, true)
                .addAnswer(3, 0, false)
                .addAnswer(3, 1, false)
                .build());

        test.addAnwserSet(new answerSet.answerSetBuilder("Duy")
                .addAnswer(1, 1, true)
                .addAnswer(2, 0, true)
                .addAnswer(3, 0, true)
                .addAnswer(3, 1, false)
                .build());

        test.calculateAllStudentScore();
    }
}
