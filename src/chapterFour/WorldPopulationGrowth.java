package chapterFour;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        System.out.print("YEAR\t\t\t" + "CURRENT WORLD POPULATION\t\t\t" + "END OF YEAR NUMERICAL INCREASE\n");
        double currentPopulation = 7900000000.0;

        for(int year = 1; year <= 75; year++){
            System.out.print(year + "\t\t\t\t\t" + currentPopulation + "\t\t\t\t");
            //System.out.printf("%d%f", year, currentPopulation);
                currentPopulation += (currentPopulation * 0.0105);
            System.out.println(currentPopulation);
            //System.out.printf("%f", currentPopulation);
        }
    }
}
