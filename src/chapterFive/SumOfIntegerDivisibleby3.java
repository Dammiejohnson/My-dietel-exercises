package chapterFive;

public class SumOfIntegerDivisibleby3 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 30; i++){
            if (i % 3 == 0){
                total+= i;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nThe total of the factors of 3 between 1 and 30 is: " + total);
    }
}
