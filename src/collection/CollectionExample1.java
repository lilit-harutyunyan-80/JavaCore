package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        names.add("Mane");
        names.add("Anna");
        names.add("Hovo");
        names.add("Valod");
        names.add("Karo");

        System.out.print("Print names: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (String s : names) {
            if (s.equals(name)) {
                found = true;
                System.out.println(name + " this name has");
                break;
            }
        }
        if(!found) {
            System.out.println(name + " this name has not");
        }


        System.out.println("Names " + names);
        String name1 = scanner.nextLine();

        if (names.contains(name)){
            names.remove(name);
            System.out.println(name + " deleting with name.");
            System.out.println("return with name: " + names);
        }else {
            System.out.println(name + " dont have this name.");
        }

        System.out.print("Введите новое имя: ");
        String newName = scanner.nextLine();

        System.out.print("Введите индекс для замены: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < names.size()) {
            names.set(index, newName);
            System.out.println("Элемент " + index + " заменен на " + newName + ".");
            System.out.println("Обновленный список имен: " + names);
        } else {
            System.out.println("Индекс " + index + " вне диапазона списка.");
        }
    }

}
