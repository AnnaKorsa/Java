
import java.io.IOException;
import java.util.Arrays;

import java.util.logging.*;


public class HW2 {
    public static void main(String[] args)throws IOException {
        int[] sort = {1,5,4,9,6,3};
        System.out.println("Исходный массив:\n" + Arrays.toString(sort));
        sortBubble(sort);


    }

//        String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
//        json = json.replaceAll(" ", "").replaceAll("\\{", "").replaceAll("\\}", "");
//        System.out.println(getRequest(json));
        //       bubbleSort();
        //  }


        //    Задание
//
//1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
//  Данные для фильтрации приведены ниже в виде json-строки. Если значение null, то параметр не должен попадать в запрос.
//  Параметры для фильтрации:
//  {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//  select * from students where 'name=Ivanov' and 'country=Russia' and...
//    static String getRequest(String json) {
//        StringBuilder sb = new StringBuilder("select * from students where ");
//        String[] str = json.split(",");/* Присваивание значений массиву по разделителю , */
//
//        for (int i = 0; i < str.length; i++) {
//            String[] arr = str[i].split(":");
//            if (arr[1].equals("\"null\"")) {  /* Ищем в массиве значение  null*/
//                continue;  /* Игнорируем null и возвращаемся  в цикл*/
//            }
//            sb.append(arr[0].substring(1, arr[0].length() - 1));/* Убираем лишние символы substring и добавляем в sb*/
//            sb.append(" = ");
//            sb.append(arr[1].substring(1, arr[1].length() - 1));
//            if (i != str.length - 1) { /* Проверка последнего элемента в массиве, для добавления and между значениями*/
//                sb.append(" and ");
//            }
//        }
//        /*Если в строка заканчивается на " and ", то удаляем последние 5 символов*/
//        if (sb.substring(sb.length() - 5).equals(" and ")) {
//            sb.delete(sb.length() - 5, sb.length());
//        }
//        return sb.toString();
//    }
//}
//2)* Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
        static int[] sortBubble ( int[] sort) throws SecurityException, IOException {
            Logger logger = Logger.getLogger(HW2.class.getName());
            FileHandler fileHandler = new FileHandler("log.txt");
            logger.addHandler(fileHandler);
            SimpleFormatter sFormat = new SimpleFormatter();
            fileHandler.setFormatter(sFormat);
            logger.log(Level.INFO, "Обходим массив от начала до конца, через вложенный цикл for");
            for (int i = 0; i < sort.length - 1; i++) {
                for (int j = 0; j < sort.length - 1; j++) {
                    if (sort[j] > sort[j + 1]) {
                        int temp = sort[j];
                        sort[j] = sort[j + 1];
                        sort[j + 1] = temp;
                        logger.log(Level.INFO, "Меняем местами значение " + sort[j] + " и значение " + sort[j+1]);
                    }
                }
            }
            logger.log(Level.INFO, "Выводим отсортированный массив в консоль");
            System.out.println("Отсортированный массив:\n" + Arrays.toString(sort));
            return sort;
        }


    }
