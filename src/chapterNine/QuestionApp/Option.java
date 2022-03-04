package chapterNine.QuestionApp;

public class Option {
    private String optionLetter;
    private String optionText;

    public Option(String optionLetter, String optionText) {
        this.optionLetter = optionLetter;
        this.optionText = optionText;
    }

    @Override
    public String toString() {
        return optionLetter + ". " + optionText;
    }
}
