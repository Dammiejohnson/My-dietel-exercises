package chapterSix;

import java.security.SecureRandom;

public class DiceRoll {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

//        for (int i = 1; i <= 20; i++){
//            int face = 1 + random.nextInt(6);
//            System.out.print(face + " ");
//
//            if (i % 5 == 0) {
//                System.out.println();
//            }
//        }

        int side1 = 0;
        int side2 = 0;
        int side3 = 0;
        int side4 = 0;
        int side5 = 0;
        int side6 = 0;

        for (int i = 1; i <= 60000000; i++){
            int face = 1 + random.nextInt(6);

            switch (face){
                case 1: side1++;
                break;
                case 2: side2++;
                break;
                case 3: side3++;
                 break;
                case 4: side4++;
                break;
                case 5: side5++;
                break;
                case 6: side6++;
                break;
            }
        }
        System.out.print("Face\t" + "Frequency\n");
        System.out.printf("1\t\t%d%n2\t\t%d%n3\t\t%d%n4\t\t%d%n5\t\t%d%n6\t\t%d%n",
                side1, side2, side3, side4,
                side5, side6);

    }
}
