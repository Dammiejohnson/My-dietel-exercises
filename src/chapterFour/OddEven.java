package chapterFour;

public class OddEven {
    // create number from 1 to 100
// check if the number divided by 2 retrns a zero.
// if the number returns a zero print number

        public static void main (String [] args){

            int count =1;
            int count2 =1;
            int even = 0;
            int odd = 0;


            System.out.println("Even numbers are: ");
            while (count <= 100) {
                even++;
                if (even % 2 == 0) {
                    System.out.print(even + " ");

                    count = count + 2;
               }
            }

            System.out.println();

            System.out.println("Odd numbers are: ");

            while (count2 <= 100) {
                odd++;
                if(odd % 2 != 0) {
                    System.out.print(odd + " ");
                    count2 = count2 + 2;

                }
            }
            System.out.println();
        }
    }

