//        Задание
//
//        1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.text.DecimalFormat;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("Введите число n: ");
//        int n = iScanner.nextInt();
//        int res =  n*(n + 1)/2;
//        System.out.println("N-ое треугольное число: " + res );
//
//    }
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
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (20 + i + j * 10 + 5 == 69) {
                    count += 1;
                    System.out.println(" ");
                    System.out.println(" Ура! Решение найдено: 2" + i + " + " + j + "5" + " = 69");
                }
            }
        }
        System.out.println(" ");
        if (count == 0) {
            System.out.println("К сожалению,решений нет:(\n");
        }

    }
}