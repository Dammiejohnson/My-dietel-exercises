package chapterFive;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        int numberOfDays = 12;
         for (int i = 1; i <= numberOfDays; i++){
             System.out.print("On the ");
             switch (i){
                 case 1:
                     System.out.print("first ");
                     break;
                 case 2:
                     System.out.print("second ");
                     break;
                 case 3:
                     System.out.print("third ");
                     break;
                 case 4:
                     System.out.print("fourth ");
                     break;
                 case 5:
                     System.out.print("fifth ");
                     break;
                 case 6:
                     System.out.print("sixth ");
                     break;
                 case 7:
                     System.out.print("seventh");
                     break;
                 case 8:
                     System.out.print("eighth ");
                     break;
                 case 9:
                     System.out.print("ninth ");
                     break;
                 case 10:
                     System.out.print("tenth ");
                     break;
                 case 11:
                     System.out.print("eleventh ");
                     break;
                 case 12:
                     System.out.print("twelve ");
                 default:
                     System.out.print("Invalid Christmas Day");
             }
             System.out.println("day of Christmas my true love sent to me: ");

             for (int j = i; j > 0; j-- ){
                 switch (j) {
                     case 1 -> System.out.print("A Partridge in a Pear Tree");
                     case 2 -> System.out.print("Two Turtle-doves");
                     case 3 -> System.out.print("Three French hens");
                     case 4 -> System.out.print("Four Calling Birds");
                     case 5 -> System.out.print("Five Golden Rings");
                     case 6 -> System.out.print("Six Geese are laying");
                     case 7 -> System.out.print("Seven swans are swimming");
                     case 8 -> System.out.print("Eight maids are milking");
                     case 9 -> System.out.print("Nine ladies dancing");
                     case 10 -> System.out.print("Ten lords are leaping");
                     case 11 -> System.out.print("Eleven pipers piping");
                     case 12 -> System.out.print("12 drummers drumming");
                     default -> System.out.print("Invalid Christmas Day");
                 }
                 System.out.println();
             }
             System.out.println();
             System.out.println("-".repeat(70));
         }
    }
}
