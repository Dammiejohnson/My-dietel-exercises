package chapterSix;

public class Kata {
    public char calculateGradeFor(int score) {
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        return 'F';
    }

    public int calculatePriceFor(int copyNumber) {
        if (copyNumber >= 500) {
            return copyNumber * 1000;
        }
        if (copyNumber >= 200) {
            return copyNumber * 1100;
        }
        if (copyNumber >= 100) {
            return copyNumber * 1200;
        }
        if (copyNumber >= 50) {
            return copyNumber * 1300;
        }
        if (copyNumber >= 30) {
            return copyNumber * 1500;
        }
        if (copyNumber >= 10) {
            return copyNumber * 1600;
        }
        if (copyNumber >= 5) {
            return copyNumber * 1800;
        }
        if (copyNumber >= 1) {
            return copyNumber * 2000;
        }
        return 0;
    }

    public static void arrayOutput(String [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayTable(){
        String dashLine = "-";
        String repeated = dashLine.repeat(20);
        System.out.println(repeated);
    }

    public static void main(String[] args) {
        String[][] arrayNumber = {{"Mr Sanni\t Abuja"}, {"Mrs Jay\t\tLekki"},{"Mrs Deji \t Sabo"}};
        arrayTable();
        System.out.printf("%s%15s%n", "NAME", "LOCATION");
        arrayTable();
        arrayOutput(arrayNumber);
        arrayTable();

    }
}
