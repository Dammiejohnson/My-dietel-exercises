package chapterSixteen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to count the number of duplicate words");
        String sentence = scanner.nextLine();
        System.out.println(returnNumberOfDuplicatedWords(sentence));
    }

    public static int returnNumberOfDuplicatedWords(String sentence) {
        sentence = sentence.toLowerCase();
        String[] array = sentence.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : array) {
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        int countOfDuplicate = 0;
        for (String key : wordCount.keySet()) {
            if (wordCount.get(key) > 1) {
                countOfDuplicate++;
            }
        }
        return countOfDuplicate;
    }
}

    /*
method2
   private static int numberOfDuplicateWords(String sentence){
        sentence = sentence.toLowerCase();
        List<String> words = new ArrayList<>();
        int count = 0;
        List<String> sentenceWords = List.of(sentence.split(""));
        List<String> checkedWords = new ArrayList<>();
        for (String sentenceWord : sentenceWords) {
            if (!(words.contains(sentenceWord))) {
                words.add(sentenceWord);
            } else {
                if(!(checkedWords.contains(sentenceWord)))
                    count++;
                checkedWords.add(sentenceWord);
            }
        }
        return count;
    }
*/

