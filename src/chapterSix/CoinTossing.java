package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
    public static void main(String[] args) {
        menuOption();
    }

    public static void tossCoin() {
            SecureRandom headOrTail = new SecureRandom();
            int head = 0;
            int tail = 0;

            for (int i = 0; i < 5; i++) {
                int result = 1 + headOrTail.nextInt(2);
                if (result == 1) {
                    head++;
                }
                if (result == 2) {
                    tail++;
                }
            }
        System.out.println("The number of heads is " + head);
        System.out.println("The number of tails is " + tail);
        }

        public static void menuOption (){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press 1 to toss a coin and 2 to exit");
            int play = scanner.nextInt();
            switch (play) {
                case 1:
                    tossCoin();
                    break;
                case 2: System.exit(0);
                default:
                    System.out.println("invalid input");
            }
        }


}

