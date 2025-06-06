package week_6;

import java.util.*;

public class ListExample {
    void list() {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        Collections.sort(linkedList);
        Collections.rotate(linkedList, 1);
        for (Integer integer : linkedList) {
            System.out.println(integer);
        }
        for (Integer it : linkedList) {
            System.out.println(it);
        }

        for (int value : linkedList) {
            System.out.println(value);
        }

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(33);
        arrayList.add(200);
        arrayList.add(500);


        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
        System.out.println(arrayList);

        List<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(200);
        linkedList1.add(300);
        linkedList1.add(400);
        linkedList1.add(500);
        System.out.println(linkedList1);

    }

}
