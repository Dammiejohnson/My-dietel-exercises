package chapterNine.Dsa;

public class ArrayList {
    private boolean isEmpty = true;
    private int size;

    public boolean isEmpty() {
        if(size == 0) return true;
        else  return false;
    }

    public void add(String item) {
        size++;
        isEmpty =  false;
    }

    public void remove(String item) {
        isEmpty = true;
        size--;
    }

    public int size() {
        return size;
    }
}
