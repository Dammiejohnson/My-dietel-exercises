package chapterEight.example.py;

public class Female extends Human{
    @Override
    public void type() {
        System.out.println("I am A female");
    }

    @Override
    public void giveBirth() {
        super.giveBirth();
        System.out.println("I can give birth");
    }

    @Override
    public void breastFeeding() {
        System.out.println("I can breastfeed");
    }

    public void catWork(){
        System.out.println("I cat work a lot");
    }
}
