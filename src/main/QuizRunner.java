package main;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultiChoiceQuestion = new MultipleChoiceQuestion("What is my favorite letter?", "C");
            myQuiz.addQuestion(myMultiChoiceQuestion);
        CheckboxClass myCheckbox = new CheckboxClass("Select all that apply", "A, B");
            myQuiz.addQuestion(myCheckbox);
        TrueFalse myTF = new TrueFalse("True or false", "true");
            myQuiz.addQuestion(myTF);

        myQuiz.runQuiz();


    }
}
