package exercises;

import java.util.Random;

public class ThreeDimensionalArray {
  public static void main(String[] args) {
//        int[][][] numbers = {{{10, 20, 21}, {11, 12, 15}, {34, 17, 43}},
//                {{10, 23, 22}, {36, 44, 22}, {48, 49, 50}},
//                {{29, 31, 43}, {40, 42, 47}, {18, 25, 24}}};
//        for (int i = 0; i < numbers.length; i++)
//            for (int j = 0; j < numbers[1].length; j++)
//                System.out.println("numbers[" + i + "][" + j + "] = "
//                        + Arrays.toString(numbers[i][j]));

////method 2 using random values
      int[][][] number = new int[3][3][3];
      Random random = new Random();

      for (int i = 0; i < number.length; i++) {
          for (int j = 0; j < number[i].length; j++) {
              for (int k = 0; k < number[1][j].length; k++) {
                  number[i][j][k] = 10 + random.nextInt(40);
                  System.out.print(number[i][j][k] + " ");
              }
              System.out.println();
          }
          System.out.println();
      }
  }
}


