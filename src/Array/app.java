package Array;

import java.util.Iterator;

public class app {
    public static void main(String[] args) {
        ObjectArray arr = new ObjectArray();

        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.print();
        System.out.println("-------addAtPosition-------");
        arr.addAtPosition(1, 40);
        arr.addAtPosition(2, 40);
        arr.print();
        System.out.println("-------remove&removeByIndex-------");
        arr.remove(40);
        arr.removeByIndex(1);
        arr.print();

        System.out.println("-------addAll-------");

        Object[] arrToAdd = {9,9,9,9,9};
        arr.addAll(6,arrToAdd);
        arr.print();

        System.out.println("-------removeRange-------");
        arr.removeRange(6,11);
        arr.print();

        System.out.println("-------Iterator-------");
        Iterator iterator = arr.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
