package chapterEight.example.py;

public class BiSex extends Human{

    @Override
    public void type() {
        System.out.println("I am A Bisexual");
    }

    @Override
    public void giveBirth() {
        super.giveBirth();
        System.out.println("I dont even know myself");
    }

    @Override
    public void breastFeeding() {
        System.out.println("I no know o, help me");
    }

    public void doBoth(){
        System.out.println("I do alot");
    }
}
