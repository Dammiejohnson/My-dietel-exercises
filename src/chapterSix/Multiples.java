package chapterSix;

public class Multiples {
    public static void main(String[] args) {
        boolean multipleOf3 = isMultiple(4, 5);
        System.out.println(multipleOf3);
    }

    private static boolean isMultiple(int number1, int number2){
        if (number1 % number2 == 0){return true;}
        else return false;
    }

}
