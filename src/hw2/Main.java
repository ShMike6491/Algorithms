package hw2;

import java.util.*;

class Obj {
    private int num;

    public Obj(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Obj{" + num +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        long t1, t2;
        Obj[] array = new Obj[10];

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = new Obj(rand.nextInt(100));
        }

        ArrayList<Obj> list = new ArrayList<>();
        LinkedList<Obj> list1 = new LinkedList<>();

        list.addAll(Arrays.asList(array));
        list1.addAll(list);

        t1 = System.nanoTime();
        //list.add(new Obj(5));
        //System.out.println(list.remove(5));
        //list.add(1, new Obj(10));
        //list.set(1, new Obj(1));

        //list1.add(new Obj(1));
        //list1.addFirst(new Obj(5));
        //list1.addLast(new Obj(5));
        //System.out.println(list1.remove(1));
        //list1.removeFirst();
        t2 = System.nanoTime();

        ListIterator<Obj> iter = list1.listIterator();
        while(iter.hasNext())
            System.out.print(iter.next());

        System.out.println();

        for (Obj obj : list) {
            System.out.print(obj);
        }

        System.out.println();
        System.out.println(t2-t1);

//        SimpleLinkedList<String> linkedList = new SimpleLinkedList<>();
//        linkedList.insert("Yo");
//        linkedList.insert("What's up");
//        linkedList.print();
    }
}
