package chapterSeventeen;

import java.security.SecureRandom;

public class SumOfRandomNumbers {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        System.out.println(random.ints(100, 1, 26)
                                 .sum());
    }
}
