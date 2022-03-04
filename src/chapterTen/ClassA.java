package chapterTen;

public abstract class ClassA extends ClassAB {
    // declaring an override annotation is not so necessary if they have the same signature number  and type  unless one plans to overeload.
    @Override
    public void wake() {
        System.out.println("ClassA is awake");
        // if classA has one abstract method, any class that extends class A would have to implement the method(s)
    }

    public abstract void wahala();
}
