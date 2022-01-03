package chapterFive;

public class ModifiedTrianglePrinting {
    public static void main(String[] args) {
        int length = 5;

        for (int row = 1; row <= length; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            for (int column = length; column >= row; column--) {
                System.out.print("  ");
            }
            for (int column = length; column >= row; column--){
                System.out.print("* ");
            }
            for (int column = 1; column <= row; column++){
                System.out.print("  ");
            }
            for (int column = 1; column <= row; column++){
                System.out.print("  ");
            }
            for (int column = length; column >= row; column--){
                System.out.print("* ");
            }
            for (int column = length; column >= row; column--){
                System.out.print("  ");
            }
            for (int column = 1; column <= row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
