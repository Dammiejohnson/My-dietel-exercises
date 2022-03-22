package chapterFourteen;

public class StringTrim {
    public static void main(String[] args) {
        String input = "    chair   man   ";
        String newInput = "";

        newInput = input.replace(" ", "");
        System.out.println(newInput);

    }
}
