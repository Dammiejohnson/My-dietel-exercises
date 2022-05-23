package exercises;

public class ReverseString2 {
    public static void main(String[] args) {
        String word = "cohort_nine";
        StringBuilder newword = new StringBuilder();

        for(int i = word.length()-1; i > -1; i--){
            newword.append(word.charAt(i));
        }
        System.out.println(newword);
    }
}

