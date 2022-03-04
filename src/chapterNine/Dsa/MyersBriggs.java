package chapterNine.Dsa;

import java.util.Scanner;

public class MyersBriggs {
    private static final String [] responses =  new String[20];
    private static final String[] question = new String[20];
    private static String personality;

    public static void main(String[] args) {
        questions();
        takeResponse();
        displayPersonalityType();
    }
    public static void questions(){
        print("""
                Welcome to MyersBriggs Personality Test.
                Answer the following questions to know your personality.
                Choose Either Options A OR B.
                """);
            question[0] = """
                Question 1:
                A expend energy, enjoy groups
                B conserve energy, enjoy one-on-one
                """;
            question[1] = """
                 Question 2:
                A interpret literally
                B look for meaning and possibilities
                """;
            question[2]= """
                 Question 3:
                A logical, thinking, questioning
                B empathetic, feeling, accommodating
                """;
            question[3]= """
                 Question 4:
                A organized, orderly
                B flexible, adaptable
                """;
            question[4]= """
                 Question 5:
                A more outgoing, think out loud
                B more reserved, think to yourself
                """;
            question[5]= """
                 Question 6:
                A practical, realistic, experimental
                B imaginative, innovative, theoretical
                """;
            question[6]= """
                 Question 7:
                A candid, straight forward, frank
                B tactful, kind, encouraging
                """;
            question[7]= """
                 Question 8:
                A plan, schedule
                B unplanned, spontaneous
                """;
            question[8]= """
                 Question 9:
                A seek many tasks,public activities, interaction with others
                B seek private, solitary activities with quiet to concentrate
                """;
            question[9]= """
                 Question 10:
                A standard, usual, conventional
                B different, novel, unique
                """;
            question[10]= """
                 Question 11:
                A firm, tend to criticize, bold the line
                B gentle, tend to appreciate, concillate
                """;
            question[11]= """
                 Question 12:
                A regulated structured
                B easygoing, "live" and "let live"
                """;
            question[12]= """
                 Question 13:
                A external, communicative, express yourself
                B internal, reticent, keep it to yourself
                """;
            question[13]= """
                 Question 14:
                A focus on here-and-now
                B look to the future, global perspective, "big picture"
                """;
            question[14]= """
                 Question 15:
                A tough-minded,just
                B tender-hearted, merciful
                """;
            question[15]= """
                 Question 16:
                A preparation, plan ahead
                B go with the flow, adapt as you go
                """;
            question[16]= """
                 Question 17:
                A active, initiate
                B reflective, deliberate
                """;
            question[17]= """
                 Question 18:
                A facts, things, "What is"
                B ideas, dreams, "What could be", philosophical
                """;
            question[18]= """
                 Question 19:
                A matter of fact, issue - oriented
                B sensitive, people-oriented, compassionate
                """;
            question[19]= """
                 Question 20:
                A control, govern
                B latitude, freedom
                """;
    }

    private static void takeResponse() {
            for (int i = 0; i < question.length; i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println(question[i]);
                print("Input:\n");
               String response = scanner.nextLine().toUpperCase();
                responses[i] = response;
                while (!response.equalsIgnoreCase("A") && !response.equalsIgnoreCase("B")){
                    print("""
                                Invalid  response! You must choose either A or B
                            """);
                    System.out.println(question[i]);
                    response =scanner.nextLine().toUpperCase();
                }
                responses[i] = response;

            }
    }
    private static String extrovertOrIntrovert(){
                int resultForA = 0;
                int resultForB = 0;
                for (int i = 0; i < responses.length; i = i+4) {
                    if(responses[i].equalsIgnoreCase("A")) resultForA++;
                    else resultForB++;
                    print("E ==>" +resultForA +"\t" + "I ==>" +resultForB);
                    if (resultForA > resultForB){
                        personality = "Extrovert";
                    }
                    else{
                        personality = "Introvert";}
                }
                return personality;
        }

    private static String sensorsOrIntuition(){
        int resultForA = 0;
        int resultForB = 0;
        for (int i = 1; i < responses.length; i = i+4) {
            if(responses[i].equalsIgnoreCase("A")) resultForA++;
            else resultForB++;
            print("S ==>" +resultForA +"\t" + "I ==>" +resultForB);
            if (resultForA > resultForB){
                personality = "Sensor";
            }
            else{
                personality = "Intuitive";}
        }
        return personality;
    }
    private static String thinkersOrFeelers(){
        int resultForA = 0;
        int resultForB = 0;
        for (int i = 2; i < responses.length; i = i+4) {
            if(responses[i].equalsIgnoreCase("A")) resultForA++;
            else resultForB++;
            print("T ==>" +resultForA +"\t" + "F ==>" +resultForB);
            if (resultForA > resultForB){
                personality = "Thinkers";
            }
            else{
                personality = "Feelers";}
        }
        return personality;
    }
    private static String judgersOrPercievers(){
        int resultForA = 0;
        int resultForB = 0;
        for (int i = 3; i < responses.length; i = i+4) {
            if(responses[i].equalsIgnoreCase("A")) resultForA++;
            else resultForB++;
            print("J ==>" +resultForA +"\t" + "P ==>" +resultForB);
            if (resultForA > resultForB){
                personality = "Judgers";
            }
            else{
                personality = "Percievers";}
        }
        return personality;
    }

    private static void displayPersonalityType(){
        print("Your Personality is :\n" );
        print(extrovertOrIntrovert());
        print(sensorsOrIntuition());
        print(thinkersOrFeelers());
        print(judgersOrPercievers());
    }

    private static void print(String message){
        System.out.println(message);
    }
    }

