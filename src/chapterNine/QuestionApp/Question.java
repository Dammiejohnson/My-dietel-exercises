package chapterNine.QuestionApp;

public class Question {
    private int questionNumber;
    private String questionText;
    private Option[] options;
    private int optionCount;
    private Option answer;


    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public Option[] getOptions() {
        return options;
    }

    public void setOptions(Option[] options) {
        this.options = options;
    }

    public void addOption(Option option) {
        if (options == null){
            options = new Option[4];
        }

        options[optionCount++] = option;


    }

    @Override
    public String toString() {
        return questionNumber + ". " + questionText +"\n" + options[0] + "\n" + options[1] + "\n"+ options[2] + "\n"+ options[3];
    }

    public Option getAnswer() {
        return answer;
    }

    public void setAnswer(Option answer) {
        this.answer = answer;
    }
}
