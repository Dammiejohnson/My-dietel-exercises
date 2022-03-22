package chapterFourteen;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = scanner.nextLine();
        StringBuilder reverseStr = new StringBuilder();

        //    String reverseStr = "";
//
//        for (int i = str.length()-1; i >= 0; i--){
//        reverseStr += str.charAt(i);
//    }
//        System.out.print(reverseStr);
//}
        for (int i = str.length()-1; i >= 0; i--){
            reverseStr.append(str.charAt(i));
        }
        System.out.print(reverseStr);
    }


}
