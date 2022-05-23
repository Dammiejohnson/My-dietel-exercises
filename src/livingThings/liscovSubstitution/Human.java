package livingThings.liscovSubstitution;

import livingThings.singleResponsibility.Mammals;

public class Human extends Mammals {
    public static void main(String[] args) {
        Human human = new Human();
        human.breastFeed();
        human.walk();
        human.cook();
    }
}
