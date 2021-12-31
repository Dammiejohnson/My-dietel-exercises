package chapterSeven;

public class Tictactoe {
    public static void main(String[] args) {
        char [] [] ticTacToe =  {{'X','O','X'}, {'X','X','X'}, {'O','X','O'}};

        for (int counter = 0; counter < ticTacToe.length; counter++ ) {
            for (int innerCounter = 0; innerCounter < ticTacToe[counter].length; innerCounter++){
                System.out.print(ticTacToe[counter][innerCounter] + "\t");

            }
            System.out.println();
        }
            // using enhanced for loop
//        for (char[] chars : ticTacToe) {
//            for (char aChar : chars) {
//                System.out.print(aChar + "\t");
//
//            }
//            System.out.println();
//        }

    }
}
