package chapterSeven;

public class ArrayStatement2 {
    public static void main(String[] args) {
        int bonus = 0;
        int [] integer = {10,20,13,14,31,17,50,100,20,11,17,18,90,14,25,60,23,40,22,30};
        for (int counter = 0; counter < integer.length; counter++ ){
            bonus = integer[counter] * 2;
            System.out.print(bonus + " ");
        }
    }
}
