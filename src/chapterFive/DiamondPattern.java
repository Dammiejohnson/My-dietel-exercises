package chapterFive;

public class DiamondPattern {
    public static void main(String[] args) {
        int length = 5;

        for (int i = 1; i <= length-1; i++) {
            for (int j = length; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= length; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            for (int j = length; j >= i; j--){
                System.out.print("* ");
            }
            for (int j= length-2; j >= i-1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
