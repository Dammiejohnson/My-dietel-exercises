package chapterThree;

import java.util. Scanner;

public class ClockTest {
	public static void main (String [] args) {

 
	Scanner input = new Scanner (System.in);
		System.out.println("Enter hour: ");
	int hour = input.nextInt();
		System.out.println("Enter minute: ");
	int minute = input.nextInt();
		System.out.println("Enter second:");
	int second = input.nextInt();

		Clock time = new Clock(hour, minute, second);
//		time.displayTime();
		System.out.println(time.displayTime());



   }
	}
