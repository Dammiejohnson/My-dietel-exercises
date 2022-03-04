package chapterEight.example.py;

public class TestHuman {
    public static void main(String[] args) {
        Human human = new Human();
        Human male = new Male();
        male.type();
        Human female = new Female();
        female.type();
        Human biSex = new BiSex();
        biSex.type();
        System.out.println("Testing poly with actual classes");
        Male humanMale = new Male();
        Female humanFemale = new Female();
        BiSex humanBiSex = new BiSex();

        Human[] humanArr = {human, male, female, biSex, humanMale};


        System.out.println("Testing Polymo with Human ");
        System.out.println("Testing human object");
        human.type();
        human.breastFeeding();
        human.giveBirth();

        System.out.println("testing male object");
        male.type();
       // male.deepVoice(); it is impossible to call this object because it was made with class human.. but male constructor
        // inheritance is that because i am male from class human, i have everything that the human have
        // polymorphism is that because  i am super class human, i can call any one of male, female and bisexual to represent me when i am called
        //abstract class must have at least one abstract method, all other methods may be concrete, although if any class must come from me
        //they must implement my abstract methods fully or be declared as an abstract class too
        // interfaces has all its methods as abstract and if you must come from it.. you must implement the methods.
    }
}
