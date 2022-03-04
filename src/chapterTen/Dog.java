package chapterTen;

public class Dog extends ClassB implements Movable {
    public void dogCannotRead(){
        System.out.println("i cannot read");
    }


    @Override
    public void move() {
        System.out.println(" i can move");
    }
}
