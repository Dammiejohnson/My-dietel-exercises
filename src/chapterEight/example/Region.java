package chapterEight.example;

public enum Region {
    NN("Ikeja", "Oshogbo", "Yaba"),
    SS("Mary Land", "VI", "ketu"),
    EE("Otta", "Bariga", "Gbagada"),
    WW("Ikorodu", "Akoka", "Sabo");

    private final String [] states;

    Region(String...states) {
        this.states = states;
        System.out.println("A wonderful place to be!!!!");
    }

    public String [] getStates() {
        return states;
    }
}
