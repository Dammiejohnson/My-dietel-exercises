package chapterEleven;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    static int count = 0;
    public static void main(String[] args) {
        int firstNumber = input("Enter first number");
        int secondNumber = input("Enter second number");
        int result = firstNumber / secondNumber;
    }

    private static int input(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        try {
            int input = scanner.nextInt();
        } catch (InputMismatchException shola) {
            count++;
            System.err.println("Invalid Input, number of tries =" + count);
            if (count >= 3) {
                System.err.println("You are not human");
                System.exit(0);
            }

        }
        return input(message);
    }
        public void anotherMethod() throws  ClassNotFoundException,IOException{
        try{
        aMethod(6);
        }
        catch(IOException e){
            throw new IOException(e.getMessage());
          //  System.out.println("caught");
        }
        finally {
            System.out.println("i must do this whether the error happens or not");

        }
        }


        public void aMethod(int input) throws IOException, ClassNotFoundException{ //if youre going to do a test for this ..
            // you have to throw the exception in the test method or you call the method in a try and catch block
        if (input == 2) throw new IOException("Na correct result");
        else throw new ClassNotFoundException("invalid");
        }



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int firstNumber = 0;
//        int secondNumber = 0;
//        try{
//            firstNumber = scanner.nextInt();
//            System.out.println("Enter a number: ");
//            secondNumber = scanner.nextInt();
//        }
//        catch (InputMismatchException error){
//            System.out.println("Try again");
//        }
//
//        try{
//            int result = firstNumber / secondNumber;
//            System.out.println("The quotient is :" + result);
//        }
//       catch (ArithmeticException error){
//           System.out.println("i dont divide by zero");
//       }


    }


