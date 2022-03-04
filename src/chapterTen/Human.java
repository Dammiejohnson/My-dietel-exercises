package chapterTen;

//A class can extend just one class but it is able to implements many interfaces
public class Human extends ClassAB implements Movable, Flyable {
    public void read(){
        System.out.println("i can read");
    }

    @Override
    public void move() {
        System.out.println("i can move like a human");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
