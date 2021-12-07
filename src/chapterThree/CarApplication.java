package chapterThree;

public class CarApplication {
    public static void main(String[] args) {

            Car toyota = new Car("venza", "2018", 200);
            Car benz = new Car("Gwagon", "2020", 9000);

        System.out.printf("%s, %s, %.2f%n", toyota.getModel(), toyota.getYear(), toyota.getPrice());
        System.out.printf("%s, %s, %.2f%n", benz.getModel(), benz.getYear(), benz.getPrice());
        System.out.println(Car.calculateDiscount(5, toyota.getPrice()));
        System.out.println(Car.calculateDiscount(7, benz.getPrice()));

    }
}
