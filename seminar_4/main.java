// 1. Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.
// Постараться не обращаться к листу по индексам.

// import java.util.LinkedList;
// import java.util.ListIterator;

// public class main {

//    public static void main(String[] args) {

//     LinkedList<Integer> list = get_linkedlist();
//     System.out.println(list);

//     ListIterator<Integer> iterator = list.listIterator(list.size());
//     LinkedList<Integer> reversed_list = new LinkedList<>();
//     while (iterator.hasPrevious()) {
//         reversed_list.add(iterator.previous());
//         }

//     System.out.println(reversed_list);
//    }
//    public static LinkedList<Integer> get_linkedlist() {
//         LinkedList<Integer> list = new LinkedList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);

//         return list;
//     }
// }

// 2.Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

// import java.util.LinkedList;

// public class main {

//    public static void main(String[] args) {

//     LinkedList<Integer> list = get_linkedlist();
//     System.out.println(list);

//     enqueue(list, 80);
//     System.out.println(list);

//     dequeue(list);
//     System.out.println(list);

//     first(list);
//     System.out.println(list);
//    }

//     // Помещает элемент в конец очереди
//     public static void enqueue(LinkedList<Integer> list, int num) {
//         list.addLast(num);
//     }
//     // Возвращает первый элемент из очереди и удаляет его
//     public static int dequeue(LinkedList<Integer> list) {
//         int num = 0;
//         num = list.get(0);
//         list.remove(0);
//         return num;
//     }
//     // Возвращает первый элемент из очереди, не удаляя
//     public static int first(LinkedList<Integer> list) {
//         int num = 0;
//         num = list.get(0);
//         return num;
//     }
//     public static LinkedList<Integer> get_linkedlist() {
//         LinkedList<Integer> list = new LinkedList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);

//         return list;
//     }
// }

// 3.Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

import java.util.LinkedList;
import java.util.ListIterator;

public class main {

   public static void main(String[] args) {

        LinkedList<Integer> list = get_linkedlist();
        System.out.println(list);

        int sum = 0;
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }

        System.out.println("Sum = " + sum);
    }

    public static LinkedList<Integer> get_linkedlist() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        return list;
    }
}