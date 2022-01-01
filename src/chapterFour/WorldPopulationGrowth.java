package chapterFour;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        System.out.print("YEAR\t\t\t" + "CURRENT WORLD POPULATION\t\t\t" + "END OF YEAR NUMERICAL INCREASE\n");
        double currentPopulation = 7900000000.0;
        double totalCurrentWorldPop = 0.0;
        double numericalIncrease = 0.0;


        for(int year = 1; year <= 75; year++){
                totalCurrentWorldPop += currentPopulation;
                numericalIncrease += (currentPopulation * 0.0105) + currentPopulation;
                if (year >= 2 &&  year < 75){
                    totalCurrentWorldPop += numericalIncrease;
                }

            //numericalIncrease += (currentPopulation * 0.0105) + currentPopulation;
            System.out.println(year + "\t\t\t\t\t" + totalCurrentWorldPop + "\t\t\t\t\t\t" + numericalIncrease);
        }
    }
}
