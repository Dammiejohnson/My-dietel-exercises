package practice;

import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {
        int [] arrayOne = {1, 2, 3};
        int [] arrayTwo = {1, 2, 3};

        System.out.println(Arrays.toString(arrayOne).equals(Arrays.toString(arrayTwo))); // this compares the content reference and gives true
        System.out.println(Arrays.toString(arrayOne)==(Arrays.toString(arrayTwo))); // this compares the object ref and gives false
    }
}
