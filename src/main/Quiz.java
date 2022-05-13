package main;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions = new ArrayList<>();
    private int numberOfCorrectUserAnswers = 0;
    private Scanner scanner = new Scanner(System.in);


    public Quiz(){

    }

    public void addQuestion(Question question){
        this.questions.add(question);
    }

    public void runQuiz(){
        for (Question question : questions){
            System.out.println(question.getQuestion());
            String userAnswer = this.getUserAnswer();
            boolean userCorrectAnswer = question.checkAnswer(userAnswer);
            if (userCorrectAnswer) this.numberOfCorrectUserAnswers++;
        }
        double percentageCorrect = ((double) this.numberOfCorrectUserAnswers/this.questions.size())*100;
        System.out.println("Users' grade: "  + percentageCorrect + "%");
    }

    private String getUserAnswer(){
        String userAnswer = scanner.nextLine();
        return userAnswer;
    }

    double percentageCorrect = (this.numberOfCorrectUserAnswers/this.questions.size())*100;


}
