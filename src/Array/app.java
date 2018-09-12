package Array;

import java.util.Iterator;

public class app {
    public static void main(String[] args) {
        Array arr = new Array();

        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        arr.addAtPosition(2, 40);
        arr.remove(40);
        arr.print();

        Iterator iterator = arr.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
