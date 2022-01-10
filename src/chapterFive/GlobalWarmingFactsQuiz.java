package chapterFive;

import java.util.Scanner;

public class GlobalWarmingFactsQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fails = 0;
        int passes = 0;
        int userInput;

        for (int i = 1; i <= 5; i++){
            switch (i){
                case 1:
                    System.out.println("A. As global warming continues, the intensity of what type of storm that hits coastlines is predicted to increase?\n" + "1. Tornadoes \n" + "2. Hurricanes\n" + "3. Tsunamis\n" + "4. Earthquakes\n");
                    userInput = scanner.nextInt();
                    if (userInput == 2) {
                        passes++;
                    }
                    else fails++;
                    break;
                case 2:
                    System.out.println("B. Earth's temperature are stable because we are surrounded by ____ which allows the right amount of sunlight in to warm the earth.\n" + "1. Snow\n" + "2. Cloud\n" + "3. An atmosphere\n" + "4. Water\n");
                    userInput = scanner.nextInt();
                    if (userInput == 3) {
                        passes++;
                    }
                    else fails++;
                    break;
                case 3:
                    System.out.println("C. Which is the greenhouse gas from the following \n" + "1. Carbonic acid\n" + "2. Carbondioxide\n" + "3. Carbon monoxide\n" + "4. Nitrous dioxide\n");
                    userInput = scanner.nextInt();
                    if (userInput == 2) {
                        passes++;
                    }
                    else fails++;
                    break;
                case 4:
                    System.out.println("D. _____ can cause global warming \n" + "1. Forest fires\n" + "2. Trees Growing\n" + "3. Solar Panel\n" + "4. HydroPower\n");
                    userInput = scanner.nextInt();
                    if (userInput == 1) {
                        passes++;
                    }
                    else fails++;
                    break;
                    case 5:
                        System.out.println("E. This layer keeps us not to hot in the summer and not too cold in the winter. Scientists call this the ____ effect.\n" + "1. GreenHouse effect\n" + "2. Summer effect\n" + "3. Cold effect\n" + "4. Layer effect\n");
                        userInput = scanner.nextInt();
                        if (userInput == 1) {
                            passes++;
                        }
                        else fails++;
                        break;
            }
        }
        System.out.printf("You got %d question(s) right and failed %d question(s)%n", passes, fails);
        System.out.println();
        if (passes == 5) {
            System.out.println("Excellent!!!!");
        }

        if (passes == 4) {
            System.out.println("Very Good!!!!");
        }
        if (passes <= 3){
            System.out.println("Time to brush up your knowledge of global warming\n" + "Visit: https://climate.selectra.com/en/environment/global-warming and https://climate.nasa.gov/ \n" + "For more details on global warming.");
        }
    }
}
