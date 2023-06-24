import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        task1();
//    }
//
//
//    static int task1(){
//         /*Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.*/
//        int[] arr = {1,1,0,1,1,1,0,1,1,1,1};
//        int maxOnes = 0;
//        int temp = 0;
//        for (int j : arr) {
//            if (j == 1) {
//                temp++;
//            } else {
//                if (temp > maxOnes) {
//                    maxOnes = temp;
//                }
//                temp = 0;
//            }
//        }
//        if(temp > maxOnes){
//             maxOnes = temp;
//        }
//        return maxOnes;
//    }

        /*Дан массив nums = [3,2,5,3] и число val = 3.Если в массиве есть числа, равные заданному,
          нужно перенести эти элементы в конец массива.Таким образом, первые несколько (или все) элементов
          массива должны быть отличны от заданного, а остальные - равны ему.*/
        int[] nums = {3, 2, 5, 3};
        int[] arr = {3, 3, 3, 3};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != arr[i]) {
                arr[count] = nums[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
}}