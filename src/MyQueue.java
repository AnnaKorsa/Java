// Анна Корсакова, группа:4739

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class MyQueue {
    private Queue<Integer> list = new LinkedList<>();
    Random rand = new Random();
    private int size = rand.nextInt(1, 10);

    Queue<Integer> creatQueue() {
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(1, 100));
        }
        return list;
    }

    boolean isEmpty() {
        return list == null;
    }

    void enqueue(int item) {
        list.add(item);
    }


    void dequeue() {
        if (list.isEmpty()) {
            System.out.println("Очередь пуста!");
        }else {
            int firstDel = list.poll();
            System.out.println("Первый элемент очереди,который будет удален: " + firstDel);
        }

    }

    void first() {
        if (list.isEmpty()) {
            System.out.println("Очередь пуста!");
        } else {
            int firstEl = list.peek();
            System.out.println("Первый элемент очереди: " + firstEl);
        }
    }

        void print() {
            if (list.isEmpty()) {
                System.out.println("Очередь пуста!");
            }else {
                System.out.println("В даный момент очередь имеет вид: " + list);
            }
    }
}


