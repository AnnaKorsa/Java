import java.util.*;

public class HW4 {
    public static void main(String[] args) {
//        reverseList(createList(15,0,20));
        task0();

    }
//    Задание
//
//  1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


    static void reverseList(LinkedList<Integer> list) {
        Collections.reverse(list);
        System.out.println("\"Перевернутый\" список: "+list);
    }

    static LinkedList<Integer> createList(int size, int min, int max) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add ((int) (Math.random() * (max - min + 1) + min));
        }
        System.out.println("Начальный список: "+list);
        return list;
    }





//    2) Реализуйте очередь с помощью LinkedList со следующими методами:
//    enqueue() - помещает элемент в конец очереди,
//    dequeue() - возвращает первый элемент из очереди и удаляет его,
//    first() - возвращает первый элемент из очереди, не удаляя.
static void task0(){

        MyQueue myQueue=new MyQueue();
    System.out.println("Дана очередь: "+ myQueue.creatQueue());
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.print();
        myQueue.dequeue();
        myQueue.print();
        myQueue.first();
        myQueue.print();
}
}
