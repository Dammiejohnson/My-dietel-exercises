package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        HashMap<Integer,String> maps =new HashMap<Integer,String>();
        int count = 0;
        System.out.println("Enter a sentence");
        Scanner scanner = new Scanner(System.in);
        String[] sentences = scanner.nextLine().split(" ");
        for(String sentence : sentences){
            count += 1;
            maps.put(count,sentence);
        }
        for (Map.Entry map : maps.entrySet()){
            System.out.println(map.getKey()+ " "+ map.getValue());
        }
    }
}
