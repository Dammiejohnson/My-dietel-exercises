package chapterNine.list;

public class ShoppingList {
    private String [] items= new String[5];
    private int count = 0;
    private int capacity;
    private String purchase;

    public ShoppingList() {

    }

    public String getPurchase() {
        return purchase;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public int getSize() {
        return count;
    }

    public int getCapacity() {
        return items.length;
    }

    public void addToList(String purchase) {
        if (items.length == count) {
            String[] newItems = items;
            items = new String[2 * getCapacity()];
            for (int i = 0; i < newItems.length; i++){
                items[i] = newItems[i];
            }
        }
        items[count] = purchase;
        count++;
    }

    public void addToListByIndex(String purchase, int index) {
        indexAndCount(index);
        for (int i = count; i > index; i--){
            items[i] = items[i-1];
        }
        items[index] = purchase;
       count++;
    }

    public void removeFromListByIndex(int index) {
        indexAndCount(index);
        for (int i = index; i < count; i++){
            if (items[index].equals(items[i])){
                items[i] = items[i+1];
                items[i+1] = null;
                count--;
            }
        }
    }

    public void getByIndex(int index) {
        indexAndCount(index);
        for( int i = 0; i < items.length; i++){
            if (i == index){
                purchase = items[i];
            }
        }

    }

    private void indexAndCount(int index) {
        if (index > (count-1)){
            System.out.println("index outta bound");
        }
    }

    public void removeFromListByName(String purchase) {
        for (int i = 0; i < count; i++){
            if(items[i].equals(purchase)){
                items[i] = null;
                count--;
            }
        }
    }

    public void removeLastInputFromList(int index) {
        indexAndCount(index);
        for( int i = 0; i <= (count-1); i++){
            if (i == (count-1)){
                count--;
                items[i] = null;
            }
        }

    }
}
