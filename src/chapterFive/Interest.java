package chapterFive;

public class Interest {
    public static void main(String[] args) {
        double principal = 1000.0;

        System.out.print("Year\t\t\t" +  "Rate\t\t\t" +"Amount on deposit\n");
        for (int year = 1; year <= 10; ++year) {
            for(int rate = 5; rate <= 10; rate++){
                double amount = principal * Math.pow(1.0 + (rate * 0.01), year);
                System.out.printf("%4d%15d%,24.2f%n", year, rate, amount);
            }
        }
    }
}

