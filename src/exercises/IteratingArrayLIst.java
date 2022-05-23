package exercises;

import java.util.ArrayList;

public class IteratingArrayLIst {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("book");
        items.add("ball");
        items.add("pen");
        items.add("tissue");
        System.out.println(items);

        for (String item : items){
            if (item.equals("pen")){
                items.remove(item);
            }
        }
        System.out.println(items);
    }
}
