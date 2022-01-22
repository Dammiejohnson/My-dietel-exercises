package chapterSeven;

public class ArrayStatement1 {
    public static void main(String[] args) {
        int [] integer = {5, 10, 10, 15, 100, 130, 19, 20, 80, 15, 13, 100, 160};

        for (int counter = 0; counter < integer.length; counter++){
            if (integer[counter] >= 10 && integer[counter] < 21){
                System.out.print(0 + " ");
            }
            else{
                System.out.print(integer[counter] + " ");
            }
        }
    }
}
