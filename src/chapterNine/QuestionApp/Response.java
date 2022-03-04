package chapterNine.QuestionApp;

public class Response {
    private String responder;
    private Option option;

    public Response(String responder, Option option) {
        this.responder = responder;
        this.option = option;
    }

    @Override
    public String toString() {
        return "Response{" +
                "responder='" + responder + '\'' +
                ", option=" + option +
                '}';
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }
}
