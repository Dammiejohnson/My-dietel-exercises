package chapterNine.QuestionApp;

import java.util.Scanner;

public class TestMB {
    public static void main(String[] args) {
        int score = 0;
        Response[] responses = new Response[2];
        Scanner scanner = new Scanner(System.in);
//        Step 1
//        a. Create a Question
        Question question1 = new Question();
//        b. set the question number
        question1.setQuestionNumber(1);
//        c. ask the question
        question1.setQuestionText("What is the origin of Boxing Day?");
//        d. give the options to the question
        question1.addOption(new Option("A", "Alms money in a box collected from church is distributed"));
        Option optionB = new Option("B", "Spare presents that are boxed up are collected on this day");
        question1.setAnswer(optionB);
        question1.addOption(optionB);
        question1.addOption(new Option("C", "Medieval traditional boxing matches were held on this day"));
        question1.addOption(new Option("D", "Leftover food was distributed in boxes"));


        Question question2 = new Question();
        question2.setQuestionNumber(2);
        question2.setQuestionText("According to the classic Christmas song what ingredient was ‘roasting on an open fire’?");
        question2.addOption(new Option("A", "Turkey"));
        question2.addOption(new Option("B", "Potatoes"));
        Option optionC = new Option("C", "Chestnuts");
        question2.setAnswer(optionC);
        question2.addOption(optionC);
        question2.addOption(new Option("D", "Sausages"));


//        Question question3 = new Question();
//        question2.setQuestionNumber(3);
//        question2.setQuestionText("Who was left ‘Home Alone’ in 1990s Christmas blockbuster?");
//        question2.addOption(new Option("A", "Kenny"));
////        Option optionB = new Option("B", "Kevin");
//        question2.addOption(new Option("C", "Kieran"));
//        question2.addOption(new Option("D", "Keith"));
//        question2.addOption(optionB);
//        question2.setAnswer(optionB);


        System.out.println("Enter your name");
        String name = scanner.nextLine();


        score = getScore(question1, scanner, name, score);
        score = getScore(question2, scanner, name, score);
//        score = getScore(question3, scanner, name, score);
//        score = getScore(question4, scanner, name, score);
//        score = getScore(question5, scanner, name, score);
//        score = getScore(question6, scanner, name, score);
//        score = getScore(question7, scanner, name, score);
//        score = getScore(question8, scanner, name, score);
//        score = getScore(question9, scanner, name, score);
//        score = getScore(question10, scanner, name, score);
//        score = getScore(question11, scanner, name, score);
//        score = getScore(question12, scanner, name, score);
//        score = getScore(question13, scanner, name, score);
//        score = getScore(question14, scanner, name, score);
//        score = getScore(question15, scanner, name, score);
//        score = getScore(question16, scanner, name, score);
//        score = getScore(question17, scanner, name, score);
//        score = getScore(question18, scanner, name, score);
//        score = getScore(question19, scanner, name, score);
//        score = getScore(question20, scanner, name, score);

        System.out.println(score);


    }

    private static int getScore(Question question, Scanner scanner, String name, int score) {
//        Scanner scanner = new Scanner(System.in)
        System.out.println(question.toString());
        System.out.println(" Enter your answer e.g A, B etc");
        String answer = scanner.nextLine();
        Response response = getResponse(answer, name, question);
        if (response.getOption().equals(question.getAnswer())){
            score++;
        }
        return score;
    }

    private static Response getResponse(String answer, String name, Question question1) {
        return switch (answer) {
            case "A" -> new Response(name, question1.getOptions()[0]);
            case "B" -> new Response(name, question1.getOptions()[1]);
            case "C" -> new Response(name, question1.getOptions()[2]);
            case "D" -> new Response(name, question1.getOptions()[3]);
            default -> throw new IllegalArgumentException("Not an option");
        };
        // [A, D, C, B]
        // [0, 1, 2, 3]
    }
}