package ChapterTwo;

import java.util.Scanner;

public class Arithmetic215 {
public static void main (String[] args){

Scanner input = new Scanner (System.in);

 System.out.println("Enter the firstInteger");
 int firstInteger = input.nextInt();
 
 System.out.println("Enter the secondInteger");
 int secondInteger = input.nextInt();
 
 int sum = firstInteger + secondInteger;
 int product = firstInteger * secondInteger;
 int difference = firstInteger - secondInteger;
 int quotient = firstInteger / secondInteger;
 
 System.out.printf("the sum of %d and %d is %d%n", firstInteger, secondInteger, sum);
 System.out.printf("the product of %d and %d is %d%n", firstInteger, secondInteger, product);
 System.out.printf("the difference of %d and %d is %d%n", firstInteger, secondInteger, difference);
 System.out.printf("the quotient of %d and %d is %d%n", firstInteger, secondInteger, quotient);



}
}
