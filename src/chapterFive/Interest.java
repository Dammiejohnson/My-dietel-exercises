package chapterFive;

public class Interest {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 0.05;

        System.out.print("Year\t\t\t" +  "Amount on deposit\n");
        for (int year = 1; year <= 10; ++year) {

            double amount = principal * Math.pow(1.0 + rate, year);

            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
}

