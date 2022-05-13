package main;

public class TrueFalse extends Question{


    public TrueFalse(String question, String correctAnswer) {
        super(question, correctAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {

        if (answer.equalsIgnoreCase(this.getCorrectAnswer())) return true;

        return false;
    }

}
