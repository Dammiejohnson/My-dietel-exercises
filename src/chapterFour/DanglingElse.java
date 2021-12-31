package chapterFour;

public class DanglingElse {
    public static void main(String[] args) {
        int x = 11;
        int y = 9;
        if (x < 10) {
            if (y > 10) {
                System.out.println("*****");
            }
        }
        else {
            System.out.println("#####");
            System.out.println("$$$$$");
        }

        for (int i = 7; i  <= 77; i+=7){
            System.out.print(i + " ");
        }

    }
}
