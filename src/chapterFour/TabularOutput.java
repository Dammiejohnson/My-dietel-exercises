package chapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N\t\t" + "N^2\t\t" +"N^3\t\t" + "N^4");

        for (int n = 1; n <= 5; n++){
            //System.out.println(n + "\t\t" + n*n + "\t\t" + n*n*n + "\t\t" + n*n*n*n);
            System.out.println((int)Math.pow(n, 1) + "\t\t" + (int)Math.pow(n, 2) + "\t\t" + (int)Math.pow(n, 3)+ "\t\t" + (int)Math.pow(n, 4));
        }
    }
}
