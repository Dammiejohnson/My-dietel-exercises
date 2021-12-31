package chapterFive;

public class SumOfSeries {
    public static void main(String[] args) {
        System.out.print("Number\t\t" + "Sum of the row\n");
        int total = 0;
        for(int i = 1; i <= 100; i++){
            for (int j = 1; j <= i; j++){
            }
            total += i;
            System.out.println(i + "\t\t\t\t" + total);
        }
    }
}
