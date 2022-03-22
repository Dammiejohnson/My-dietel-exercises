package chapterFourteen;

import java.util.ArrayList;
import java.util.List;

public class StringExercise {
    public static void main(String[] args) {
        String input = "MiSsiSsippi";
        List<Integer> newString = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (String.valueOf(input.charAt(i)).equalsIgnoreCase("s")){
                newString.add(i);
            }
        }

        System.out.println(newString);
    }
}
