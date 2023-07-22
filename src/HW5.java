public class HW5 {
    public static void main(String[] args) {
// Задание
//
//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("375259336355","Иван");
        phoneBook.add("375295623565","Алексей");
        phoneBook.add("375297859686","Анна");
        phoneBook.add("375253215686","Иван");
        phoneBook.add("375335698565","Илья");
        phoneBook.add("375252563789","Анна");
        phoneBook.add("375447403440","Анна");
        phoneBook.add("375336592401","Светлана");
        System.out.println(phoneBook.getByPhoneNum("375336592401"));
        System.out.println(phoneBook.getByName("Анна"));
//        System.out.println(phoneBook.getAll());
        System.out.println(phoneBook.getAllSort());

    }
}