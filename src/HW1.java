//        Задание
//
//        1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.text.DecimalFormat;
import java.util.*;

public class HW1 {
    public static void main(String[] args) {
        task0();
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("Введите число n: ");
//        int n = iScanner.nextInt();
//        int res =  n*(n + 1)/2;
//        System.out.println("N-ое треугольное число: " + res );
//
    }
//
//}

//        2) Вывести все простые числа от 1 до 1000
//


//        int n = 100;
//        int count = 0;
//        for (int i = 2; i < n + 1; i++) {  /* Перебираем числа от 2ух до 100*/
//            for (int j = 2; j < i; j++) {   /* Подбираем делители и считаем*/
//                if (i % j == 0) {
//                    count = count + 1;
//                }
//            }
//            if (count == 0) {  /* Простое число, это такое число, которое делится на себя и на единицу. Если других делителей нет, то выводим в консоль*/
//                        System.out.print(i + " ");
//                } else {
//                    count = 0;  /* Сбрасываем счетчик*/
//            }
//        }
//    }
//}


//        3) Реализовать простой калькулятор


//            Scanner iScanner = new Scanner(System.in);
//            System.out.print("Введите первое число: ");
//            double a = iScanner.nextDouble();
//            System.out.print("Введите второе число: ");
//            double b = iScanner.nextDouble();
//            System.out.print("Введите оператор (+, -, *, /): ");
//            char c = iScanner.next().charAt(0);
//
//        double result;
//        switch (c) {
//            case '+':
//                result = a + b;
//                break;
//            case '-':
//                result = a - b;
//                break;
//            case '*':
//                result = a * b;
//                break;
//            case '/':
//                if (b ==0){
//                    System.out.println("На 0 делить нельзя!");
//                }else {
//                    result = a / b;
//                break;   }
//            default:
//                System.out.println("Ошибка! Операция не распознана. Повторите ввод.");
//                return;
//        }
//        System.out.println("");
//        System.out.print("Результат:\n" + new DecimalFormat( "###.##" ).format(a) + " " + c + " " + new DecimalFormat( "###.##" ).format(b) + " = " +new DecimalFormat( "###.##" ).format(result));
//    }
//}
//


//      4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
//      Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
//      Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
//        int count = 0;
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                if (20 + i + j * 10 + 5 == 69) {
//                    count += 1;
//                    System.out.println(" ");
//                    System.out.println(" Ура! Решение найдено: 2" + i + " + " + j + "5" + " = 69");
//                }
//            }
//        }
//        System.out.println(" ");
//        if (count == 0) {
//            System.out.println("К сожалению,решений нет:(\n");
//        }
//
//    }
//}

//**Текст задачи:**
//1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//
//2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

//static void task0(){
//    List<Integer> list = new ArrayList<>();
//    Queue<Integer> linked = new LinkedList<>();
//
//    long start = System.currentTimeMillis();
//    for (int i = 0;i<10000;i++){
//        list.add(i);
//    }
//
//
//    long end = System.currentTimeMillis();
//    for (int i = 0;i<10000;i++){
//        list.add(i);
//    }
//    long second = System.currentTimeMillis();
//





// Реализовать консольное приложение, которое:
//
//1. Принимает от пользователя строку вида
//text~num
//1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

//    static void task0(){
//        Queue<String> linked = new LinkedList<>();
//        Scanner scanner= new Scanner(System.in);
//        boolean work = true;
//        while (work){
//            System.out.println("ВВедите команду: ");
//            String line = scanner.nextLine();
//            String[] arr = line.split("~");
//            int num = Integer.parseInt(arr[1]);
//            String text = arr[0];
//            switch (text){
//                case "print":
//                    System.out.println(linked.remove(num));
//                    break;
//                case "exit":
//                    System.out.println("До встречи!");
//                    work = false;
//                    break;
//                default:
//                    linked.add(num, text);
//
//                    List<String> linked = new LinkedList<>();
//                    Scanner scanner = new Scanner(System.in);
//                    boolean work = true;
//                    while (work){
//                        System.out.println("Введи команду! ");
//                        String line = scanner.nextLine();
//                        String[] arr = line.split("~");
//                        int num = Integer.parseInt(arr[1]);
//                        String text = arr[0];
//                        switch (text){
//                            case "print" :
//                                System.out.println(linked.remove(num));
//                                break;
//                            case "exit" :
//                                System.out.println("До встречи!");
//                                work = false;
//                                break;
//                            default:
//                                linked.add(num, text);
//
//                        }
//                    }

//
//            }
//        }
//    }
//static void task0(){
////        Реализовать консольное приложение, которое:
////
////1. Принимает от пользователя и “запоминает” строки.
////2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
////3. Если введено revert, удаляет предыдущую введенную строку из памяти.
//   LinkedList<String> linked = new LinkedList<>();
//        Scanner scanner= new Scanner(System.in);
//        boolean work = true;
//        while (work){
//            System.out.println("Введите строку");
//            String text = scanner.nextLine();
//            text= text.trim();
//            switch (text){
//                case "exit":
//                    work= false;
//                    break;
//                case "revert":
//                    linked.removeLast();
//                    break;
//                case "print":
//                    ListIterator listIterator= linked.listIterator(linked.size());
//                    while (listIterator.hasPrevious()){
//                        System.out.println(listIterator.previousIndex());
//                    }
//                    break;
//                default:
//                    linked.add(text);
//            }
//        }
//LinkedList<String> linked = new LinkedList<>();
//        Scanner scanner = new Scanner(System.in);
//        boolean work = true;
//        while (work) {
//            System.out.println("Введите строку: ");
//            String text = scanner.nextLine();
//            text = text.trim();
//            switch (text){
//                case "exit" :
//                    work = false;
//                    break;
//                case "revert" :
//                    linked.removeLast();
//                    break;
//                case "print" :
//                    ListIterator listIterator = linked.listIterator(linked.size());
//                    while (listIterator.hasPrevious()){
//                        System.out.println(listIterator.previous());
//                    }
//                    break;
//                default:
//                    linked.add(text);
//            }
//        }


//    static void task0(){
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        while (stack.isEmpty()){
//            System.out.println(stack.pop());/* выводит и удаляет*/
//        }
//
//        Queue<Integer> queue= new LinkedList<>();
//        queue.offer(1);
//        queue.offer(2);
//        queue.offer(3);
//        queue.offer(4);
//        queue.offer(5);
//        while (!queue.isEmpty()){
//            System.out.println(queue.poll());
//            queue.s
//        }
//
//    }
//1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
//
//2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.






    static void task0(){
        MyStask myStask= new MyStask();
        myStask.push(1);
        myStask.push(2);
        myStask.push(3);
        myStask.push(4);
        myStask.push(5);
        System.out.println(myStask.empty());
        System.out.println(myStask.pop());
        System.out.println(myStask.peak());
        System.out.println(myStask.size());
//        Реализовать стэк с помощью массива. Нужно реализовать методы:
//
//size(), empty(), push(), peek(), pop().

    }
}
