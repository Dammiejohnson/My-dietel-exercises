package chapterSeven;

public class Names {
    public static void main(String[] args) {
//       String [] names = new String[4];
//       names [0] = "dami";
//       names [1] = "Sanni";
//       names [2] = "Johnson";
//       names [3] = "taye";

       String [] names = {"DAMI", "SANNI", "JOHNSON","TAYE" };
        for (int counter = 0; counter < names.length; counter++) {
            System.out.printf("%d\t%s%n", counter, names[counter]);
        }

    }
}
