package chapterTen;

//theres no need to indicate public,abstract in the method because it is unneccessary since it is abstract implicitly.
// it cannot be private
// note that it is possible to have interfaces without methods, that wil be blank or empty
// interfaces have a naming system "-able";
public interface Movable {
    void move();

    default void hide(){

    }
    // evEry class that implements the method hide but its not compelled to implement this method
    // this would have been done better using an abstract class.
    // every class that implements this interface has this method by default but if they write the same method and implements this.. it cuts this off


}
