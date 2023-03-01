/*
Пусть дан список сотрудников:
Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
*/

import java.util.*;

public class task_2 {

   public static void main(String[] args) {
      String strInput = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
      String[] arrInput = strInput.split(", ");

      TreeMap<String, Integer> map = new TreeMap<>();

      String name;
      for (String str: arrInput) {
         name = str.split(" ")[0];
         if (map.containsKey(name)){
            Integer value = map.get(name);
            value ++;
            map.put(name, value);
         }
         else map.put(name, 1);
      }
      print(getSortedMap(map));
   }

   static void print(TreeMap<String, Integer> map) {
      for (String key : map.keySet()) {
         String value = map.get(key).toString();
         System.out.println(key + " " + value);
      }
   }
   static TreeMap<String, Integer> getSortedMap(TreeMap<String, Integer> map) {
      Comparator<String> valueComparator = new Comparator<String>() {
         @Override
         public int compare(String a, String b) {
            Integer v1 = map.get(a);
            Integer v2 = map.get(b);
            return v2.compareTo(v1);
         }
      };
      TreeMap<String, Integer> sortedMap = new TreeMap<>(valueComparator);
      sortedMap.putAll(map);
      return sortedMap;
   }
}