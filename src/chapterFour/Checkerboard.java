package chapterFour;

public class Checkerboard {
    public static void main(String[] args) {

        for (int i = 1; i<= 8; i++){
            if ( i % 2 == 0)
                System.out.print(" ");
            for (int j = 1; j <= 8; j++){
                System.out.print("* ");
            }
            System.out.println();
    }

        System.out.println();

        int row = 1;
        while (row <= 8){
            int column = 0;
            while (column < 8){
                System.out.print("* ");
                column++;
            }
            System.out.println();
            row++;
            if(row % 2 ==0) {
                System.out.print(" ");
            }
        }
    }
}
