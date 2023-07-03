//import java.awt.*;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.*;
//import java.util.List;
//import java.util.logging.FileHandler;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.util.logging.SimpleFormatter;
//
//public class Main {
//    public static void main(String[] args) {
//        Task4(wordRepeat("Test", 20));
//    }
//        System.out.println(task1("aaaaabbccchhhhkaa"));
//    }

    //
//
//    static int task1() {
//        /*Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.*/
//        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
//        int maxOnes = 0;
//        int temp = 0;
//        for (int j : arr) {
//            if (j == 1) {
//                temp++;
//            } else {
//                if (temp > maxOnes) {
//                     maxOnes =temp;
//                }
//                temp = 0;
//            }
//        }
//        if (temp > maxOnes) {
//            maxOnes = temp;
//        }
//        return maxOnes;
//    }
//}

    /*Дан массив nums = [3,2,5,3] и число val = 3.Если в массиве есть числа, равные заданному,
      нужно перенести эти элементы в конец массива.Таким образом, первые несколько (или все) элементов
      массива должны быть отличны от заданного, а остальные - равны ему.*/
//    int[] nums = {3, 2, 5, 3};
//    int[] arr = {3, 3, 3, 3};
//    int count = 0;
//        for(int i = 0; i < nums.length;i++){
//        if (nums[i] != arr[i]) {
//            arr[count] = nums[i];
//            count++;
//        }
//    }
//        System.out.println(Arrays.toString(arr));
//}}

//           System.out.println(task0(10,'1','2'));
       // Текст задачи:
       // Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
//        static String task0 (int n, char c1, char c2){
//            if(n%2==0){
//                StringBuilder stringBuilder = new StringBuilder();
//                for (int i = 0; i < n/2; i++) {
//                    stringBuilder.append(c1).append(c2);
//                }
//                return stringBuilder.toString();
//            } else {
//                System.out.println("N is not even number! ");
//                return null;
//            }
//
//        }}




       // Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
//       static String task1(String str){
//            /* Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd. Выход: a4b3c1d2*/
//            char[] chars = str.toCharArray();
//            Arrays.sort(chars);
//            int count = 0;
//            StringBuilder stringBuilder = new StringBuilder();
//
//            for (int i = 1; i < chars.length ; i++) {
//                if(chars[i] == chars[i-1]) count++;
//                else {
//                    stringBuilder.append(chars[i-1]).append(count+1);
//                    count = 0;
//                }
//            }
//            stringBuilder.append(chars[chars.length-1]).append(count+1);
//            return stringBuilder.toString();
//        }}


/* Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.*/

//
//static String wordRepeat(String word, int n){
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            stringBuilder.append(word);
//        }
//        System.out.println(stringBuilder.toString());
//        return stringBuilder.toString();
//    return word.repeat(n);
//    }
//
//    static void task2(String str) {
//        String path = "ext.txt";
//        try (FileWriter fileWriter = new FileWriter(path, true);){
//            fileWriter.write(str);
//            fileWriter.flush();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }
//
//
//static void task3(String str) {
//        String path = "";
//
//        Logger logger = Logger.getAnonymousLogger();
//        FileHandler fileHandler = null;
//        try {
//            fileHandler = new FileHandler(path, true);
//        } catch (IOException e){/*обработка исключений*/
//            e.printStackTrace();
//        }
//        logger.addHandler(fileHandler);
//        SimpleFormatter simpleFormatter = new SimpleFormatter();
//        fileHandler.setFormatter(simpleFormatter);
//
//        try (FileWriter fileWriter = new FileWriter("g/g/g//g/g/tex.txt", true);){
//            fileWriter.write(str);
//            fileWriter.flush();
//        } catch (Exception e){
//            e.printStackTrace();
//            logger.log(Level.INFO, e.getMessage());
//        }
//
//        fileHandler.close();
//        logger.getHandlers()[0].close();
//}
//}


//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

//System.out.println(Task05("1 232 1"));

//
//        public static boolean Task05(String text) {
//            StringBuilder stringBuilder = new StringBuilder(text);
//            String newText = stringBuilder.reverse().toString();
//            return newText.equals(text);
//        }
//
//import java.util.Iterator;
//
//
//public class Main {
//    public static void main(String[] args) {
//       task4();
//        task1(createList(10,0,10));


 //       System.out.println(task1("aaaaabbccchhhhkaa"));
//        Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
//
//String s1 = "hello";
//
//String s2 = "hello";
//
//String s3 = s1;
//
//String s4 = "h" + "e" + "l" + "l" + "o";
//
//String s5 = new String("hello");
//
//String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
//        System.out.println(s1==s2);
//        System.out.println(s2==s3);
//        System.out.println(s3==s4);
//        System.out.println(s4==s5);
//        System.out.println(s5==s6);
//        System.out.println(s4==s5);
//        System.out.println(s1.equals(s2));
//        System.out.println(s2.equals(s3));
//        System.out.println(s3.equals(s4));
//        System.out.println(s4.equals(s5));
//        System.out.println(s5.equals(s6));
       // Текст задачи:
//        Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
//    static void task1(List<Integer> list){
//        Collections.sort(list, Comparator.reverseOrder());
//        System.out.println(list);
//        }
//    static List<Integer> createList(int size, int min, int max){
//        List<Integer> list = new ArrayList<>(size);
//        for (int i = 0; i<size;i++){
//            list.add((int) (Math.random()*(max-min+1)+min));
//        }
//        return list;



//    Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
//    Пройти по списку, найти и удалить целые числа.
//    static void task2(){
//        List list = new ArrayList();
//        list.add("list");
//        list.add(77);
//        list.add(55);
//        list.add("hello");
//        list.add(12);
//
//        Iterator iterator= list.iterator();
//        while (iterator.hasNext()){
//            Object o = iterator.next();
//            if (o instanceof Integer|| o instanceof String){
//                iterator.remove();
//            }
//        }
//        System.out.println(list);


//        Каталог товаров книжного магазина сохранен в виде двумерного списка
//        List<ArrayList<String>> так, что на 0й позиции каждого внутреннего
//        списка содержится название жанра, а на остальных позициях -
//        названия книг. Напишите метод для заполнения данной структуры.
    //фантастика
//    приключения
//    классика
//    детектив
//    static void task4(){
//        List<ArrayList<String>> catalog = new ArrayList<>();
//        addBook("Фантастика", "Трудно быть богом",catalog);
//        addBook("Фантастика", "Марсианин",catalog);
//        addBook("Детектив", "Трудно быть богом",catalog);
//        addBook("Фантастика", "Люди",catalog);
//        System.out.println(catalog);


//
//    }
//    static void addBook(String type, String name, List<ArrayList<String>> catalog){
//        boolean  hasType = false;
//        for (int i = 0; i< catalog.size();i++){
//            if (catalog.get(i).get(0).equals(type)){
//                catalog. get(i).add(name);
//                return;
//            }
//        }
//        ArrayList<String> t = new ArrayList<>();
//        t.add (type);
//        t.add(name);
//        catalog.add(t);
//    }
//    }
//    /*
//     * Каталог товаров книжного магазина сохранен
//     * в виде двумерного списка List<ArrayList<String>> так,
//     * что на 0й позиции каждого внутреннего списка содержится название жанра,
//     * а на остальных позициях - названия книг.
//     * Напишите метод для заполнения данной структуры.
//     */
//
//    public static void task04() {
//        List<ArrayList<String>> catalog = new ArrayList<>();
//        addBook("Фантастика", "Трудно быть богом", catalog);
//        addBook("Фантастика", "Марсианин", catalog);
//        addBook("Детектив", "Убийство в восточном экспрессе", catalog);
//        System.out.println(catalog);
//    }
//
//    public static void addBook(String type, String name, List<ArrayList<String>> catalog) {
//        for (int i = 0; i < catalog.size(); i++) {
//            if (catalog.get(i).get(0).equals(type)) {
//                catalog.get(i).add(name);
//                return;
//            }
//        }
//        ArrayList<String> t = new ArrayList<>();
//        t.add(type);
//        t.add(name);
//        catalog.add(t);
//    }