package chapterFourteen;

public class Trimming {
    public static void main(String[] args) {
        trim("    chair      man     ");
    }

    private static void trim(String string) {
        string = string.trim();
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)!=' '){
                newWord.append(string.charAt(i));
            }
        }
        System.out.println(newWord);
    }
}
