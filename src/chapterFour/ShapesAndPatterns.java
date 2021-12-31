package chapterFour;

public class ShapesAndPatterns {
    public static void main(String[] args) {
        int length = 5;

        for (int row = 1; row <= length; row++){
           for (int column = 1; column <= length; column++){
               System.out.print("* ");
           }
           for (int column = row; column <= length; column++){
               System.out.print("  ");
           }
           for (int column = 1; column <= row; column++){
               System.out.print(" *");
           }

           for (int column = row; column <= length; column++){
               System.out.print("  ");
           }

            for (int column = 1; column <= row; column++){
                System.out.print("  ");
            }

            for (int column = row; column <= length; column++){
                System.out.print(" *");
            }

            for (int column = 1; column <= row; column++){
                System.out.print("  ");
            }

            for (int column = 1; column<= length; column++){
                System.out.print("  ");
            }
            for (int column = 1; column<= row; column++){
                System.out.print("* ");
            }

          for (int column = row; column<= length; column++){
              System.out.print("  ");
          }

            for (int column = 1; column<= row; column++){
                System.out.print("  ");
            }

            for (int column = row; column<= length; column++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}