package chapterSix;

public class Kata {
    public char calculateGradeFor(int score) {
        if (score >= 90) return 'A';
        if (score >= 80)  return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        return 'F';
    }
    public int calculatePriceFor(int copyNumber){
        if (copyNumber >= 500) {return copyNumber * 1000;}
        if (copyNumber >= 200) {return copyNumber * 1100;}
        if (copyNumber >= 100) {return copyNumber * 1200;}
        if (copyNumber >= 50) {return copyNumber * 1300;}
        if (copyNumber >= 30) {return copyNumber * 1500;}
        if (copyNumber >= 10) {return copyNumber * 1600;}
        if (copyNumber >= 5) {return copyNumber * 1800;}
        if (copyNumber >= 1) {return copyNumber * 2000;}
        return 0;
    }
}
