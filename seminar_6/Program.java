/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
        Создать множество ноутбуков.
        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
        отвечающие фильтру. Критерии фильтрации можно хранить в Map.
        Например: “Введите цифру, соответствующую необходимому критерию:
        1 - ОЗУ
        2 - Объем ЖД
        3 - Операционная система
        4 - Цвет …
        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
        Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Notebook> notebooks = new ArrayList<>();

        notebooks.add(new Notebook("Asus", 4000, 10000, "Windows 10", "black"));
        notebooks.add(new Notebook("Acer", 2000, 8000, "Windows 10", "white"));
        notebooks.add(new Notebook("Apple", 16000, 100000, "Apple OS", "white"));
        notebooks.add(new Notebook("Xiaomi", 3000, 2000, "Non OS", "black"));
        notebooks.add(new Notebook("Samsung", 2000, 5000, "Arch Linux", "silver"));

        Notebook myDreamNotebook = myDreamNotebook(input);
        input.close();
        System.out.println("------------------");
        System.out.println("Ваш запрос: \n" + myDreamNotebook.toString());
        System.out.println("------------------");
        System.out.println("Наши предложения:");
        select(myDreamNotebook, notebooks);
        System.out.println("------------------");
    }

    private static void select(Notebook myDreamNotebook, ArrayList<Notebook> notebooks) {
        for (Notebook notebook: notebooks) {
            notebook.toString();
            Boolean thisIsCool = true;
            if (notebook.getRam() < myDreamNotebook.getRam()) thisIsCool = false;
            if (notebook.getHdd() < myDreamNotebook.getHdd()) thisIsCool = false;
            if (!myDreamNotebook.getColor().equals("any") &
                !notebook.getColor().equals(myDreamNotebook.getColor()))
                        thisIsCool = false;

            if (thisIsCool == true) System.out.println(notebook.toString());
        }
    }

    static Notebook myDreamNotebook(Scanner input){
        System.out.println("Enter minimal RAM: ");
        Integer ram = Integer.valueOf(input.next());
        System.out.println("Enter minimal HDD: ");
        Integer hdd = Integer.valueOf(input.next());
        System.out.println("Enter like COLOR: ");
        String color = input.nextLine();color = input.nextLine();
        Notebook myDreamNotebook = new Notebook("", ram, hdd, "", color);
        return myDreamNotebook;
    }
}
