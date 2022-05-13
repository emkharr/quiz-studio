package main;

public class CheckboxClass extends Question{

    public CheckboxClass(String question, String correctAnswer) {
        super(question, correctAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        String correctAnswer = this.getCorrectAnswer();
        if (answer.equalsIgnoreCase(correctAnswer)) return true;

        return false;
    }
}
