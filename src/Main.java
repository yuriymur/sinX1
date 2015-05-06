import java.util.Scanner;

/**
 * Created by student on 29.04.2015.
 */

public class Main {
    public static void main(String[] args) {
        AddresBook book1 = new AddresBook();
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("1. Добавление записи (дополнительно запрашивается имя, телефон и e-mail)\n" +
                    "2. Поиск записей (дополнительно запрашиватеся имя для поиска)\n" +
                    "3. Вывод всех записей\n" +
                    "4. Удаление записи (дополнительно запрашивается индекс записи для удаления)\n" +
                    "5. Изменение записи (дополнительно запрашивается индекс изменяемой записи, новые имя, телефон и e-mail)\n" +
                    "6. Выход из программы");
            // поиск печать выход
            int command = s.nextInt();
            switch (command){
                case 1 :
                    System.out.println("Ввведите имя");
                    String name = s.next();
//                    book1.add ();

                    System.out.println("Ввведите телефон");
                    String phone = s.next();

                    System.out.println("Ввведите почтовый адрес");
                    String mail = s.next();
                    Address newaddr = new Address(name,phone,mail);
                    book1.add(newaddr);
                    // выполнение кманды 1
                    break;
                case 2:
                    System.out.println("Введите имя для поиска");
                    String namefind = s.next();
                    int[] found = book1.find(namefind);
                    for (int i = 0;i<found.length;i++){
                        System.out.println(book1.list[found[i]]);

                    }
                    if (found.length == 0) {
                        System.out.println("Ничего не найдено");

                    }


                // выполнение команды 2
                    break;
                case 3:
                    book1.printAll();
                    break;

                case 4:
                    System.out.println("Введите индекс записи");
                    int indexDelete = s.nextInt();
                    book1.delete(indexDelete);


                    break;
                case 5:


                    break;
                case 6:
                    return;
                default:
                    break;
            }


        }






//        Address ivan = new Address("Ivan","123","ivan@mail");
//        book1.add(ivan);
//        book1.add(ivan);
//        book1.add(ivan);
//        book1.add(ivan);
//        book1.printAll();
    }
}
// проверять индекс
// выводить индекс
// сохраниение и чтение из файла
//

