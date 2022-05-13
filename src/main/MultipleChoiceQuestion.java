package main;

import java.util.Locale;

public class MultipleChoiceQuestion extends Question{


    public MultipleChoiceQuestion(String question, String correctAnswer) {
        super(question, correctAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        String correctAnswer = this.getCorrectAnswer();
        if (answer.equalsIgnoreCase(correctAnswer)) return true;
        return false;
    }
}
