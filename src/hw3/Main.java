package hw3;

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
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Stack<Obj> myStack = new Stack<>();
        myStack.addAll(Arrays.asList(array));

        Queue<Obj> myQueue = new LinkedList<>(Arrays.asList(array));
        Deque<Obj> myDeque = new ArrayDeque<>(Arrays.asList(array));
        PriorityQueue<Obj> myPriority = new PriorityQueue<Obj>();


        t1 = System.nanoTime();
        //System.out.println(myStack.peek());
        //System.out.println(myStack.pop());
        //System.out.println(myStack.search(new Obj(15)));

        //System.out.println(myQueue.add(new Obj(15)));
        //System.out.println(myQueue.offer(new Obj(10)));
        //System.out.println(myQueue.remove());
        //System.out.println(myQueue.poll());
        //System.out.println(myQueue.peek());

        //System.out.println(myDeque.add(new Obj(1)));
        //myDeque.addFirst(new Obj(1));
        //myDeque.addLast(new Obj(1));
        //myDeque.offerFirst(new Obj(1));

        //myPriority.add(new Obj (12));
        t2 = System.nanoTime();

        for (Obj obj : myPriority) {
            System.out.print(obj + " ");
        }

        System.out.println();
        System.out.println(t2-t1);
    }
}
