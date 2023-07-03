import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Задание
//
//Пусть дан произвольный список целых чисел.
//
//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение
public class HW3 {
    public static void main(String[] args) {
        List<Integer> list = createList(10, 15, 1);
        removeEvenNum(list);
        maxNumber(list);
        minNumber(list);
        averageValue(list);
    }

    static List<Integer> createList(int size, int max, int min) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min) + min));
        }
        System.out.println("Начальный массив: " + list);
        return list;
    }

    static void removeEvenNum(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println("Массив нечетных чисел:" + list);
    }

    static void maxNumber(List<Integer> list) {

        System.out.println("Максимальное значение: " + Collections.max(list));
    }

    static void minNumber(List<Integer> list) {
        System.out.println("Минимальное значение: " + Collections.min(list));
    }

    static void averageValue(List<Integer>list) {
        double summ= 0,res= 0;
        for (int i= 0;i< list.size();i++){
            summ += list.get(i);
        }
        res = summ / list.size();
        System.out.format("Среднее значение: %.2f ",  res);
    }
}

