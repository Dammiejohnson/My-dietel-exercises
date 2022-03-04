package ChapterTwo;

import java.util.Scanner;
	public class ScoreGrade {
	public static void main (String [] args){
	
	Scanner input = new Scanner (System.in);
	
	System.out.println ("Enter your Score over 100:");
	int score = input.nextInt();
	
	if (score > 90) {
	System.out.println ("Your grade is A.\n");
	}
	
	if (score > 80) {
	if (score < 90) {
	System.out.println ("Your grade is B.\n");
	}
	}
	
	
	if (score > 70) {
	if (score < 80) {
	System.out.println ("Your grade is C.\n");
	}
	}


	if (score > 60) {
	if (score < 70) {
	System.out.println ("Your grade is D.\n");
	}
	}

	
	if (score < 60) {
	System.out.println ("Your grade is F.\n");
	}
	


       }
       }
