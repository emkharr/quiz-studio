package main;

import java.util.ArrayList;

public abstract class Question {
    private final String question;
    private final String correctAnswer;

    public Question(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }


    public abstract boolean checkAnswer(String answer);
}
