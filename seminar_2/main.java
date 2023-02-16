//        1. Дана строка sql-запроса "select * from students where ".
//        Сформируйте часть WHERE этого запроса, используя StringBuilder.
//        Данные для фильтрации приведены ниже в виде json строки.
//        Если значение null, то параметр не должен попадать в запрос.
//        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

//import org.json.JSONObject;
//
//public class main {
//    public static void main(String[] args){
//        String sql_str = "select * from students where";
//        StringBuilder sql_sb = new StringBuilder(sql_str);
//
//        JSONObject person = new JSONObject();
//        person.put("name", "Ivanov");
//        person.put("country", "Russia");
//        person.put("city", "Moscow");
//        person.put("age", "null");
//
//        for (Object key : person.keySet()) {
//            Object value = person.get((String) key);
//            if (value != "null"){
//                sql_sb.append(" " + key);
//                sql_sb.append(" = ");
//                sql_sb.append(value);
//            }
//        }
//        System.out.println(sql_sb);
//    }
//}


//        2. Реализуйте алгоритм сортировки пузырьком числового массива,
//        результат после каждой итерации запишите в лог-файл.

//import java.util.logging.Logger;
//
//public class main {
//    public static void main(String[] args){
//        int[] array = new int[] {4,6,1,3,2,0,0,45,23};
//        bubbleSort(array);
//        print(array);
//    }
//    public static void bubbleSort(int[] arr) {
//        Logger logger = Logger.getLogger(main.class.getName());
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    logger.info(String.format("Change %d with %d", arr[j], arr[j+1]));
//                }
//                else logger.info("No change");
//            }
//        }
//    }
//    public static void print(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("%d ", arr[i]);
//        }
//    }
//}


//        3*. Дана json строка (можно сохранить в файл и читать из файла)
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
//        {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//        {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//
//        Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
//        Студент [фамилия] получил [оценка] по предмету [предмет].
//        Пример вывода:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class main {

    public static void main(String[] args) {

        JSONArray base_array = getBaseFromFile();
        if (base_array != null){
            StringBuilder[] result = getStudentsInfo(base_array);

            for (int i = 0; i < result.length ; i++) {
                System.out.println(result[i]);
            }

        }else System.out.println("Ошибка");
    }
    static JSONArray getBaseFromFile(){
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("\\seminar_2\\base.txt");
        try {
            String base_txt = new String(Files.readAllBytes(Paths.get(pathFile)));
            JSONArray base_array = new JSONArray(base_txt);
            return base_array;
        } catch (JSONException e) {
//            e.printStackTrace();
            System.out.println("Неправильный формат файла.");
            return null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static StringBuilder[] getStudentsInfo(JSONArray base_array){
        StringBuilder[] result_arr = new StringBuilder[base_array.length()];

        for (int i = 0; i < base_array.length(); i++) {
            JSONObject student = base_array.getJSONObject(i);
            StringBuilder result_sb = new StringBuilder();

            String family = student.get("фамилия").toString();
            String grade = student.get("оценка").toString();
            String item = student.get("предмет").toString();

            result_sb.append("Студент " + family + " получил " + grade + " по предмету " + item);
            result_arr[i] = result_sb;
        }
        return result_arr;
    }
}

//        4*. К калькулятору из предыдущего дз добавить логирование.

//import java.io.IOException;
//import java.util.Scanner;
//import java.util.logging.*;
//
//public class main {
//    public static void main(String[] args) throws IOException {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.println("Введите одной строкой действие и операнды через пробел. Пример 3 * 4");
//        System.out.println("Enter line: ");
//        String str_input = iScanner.next();
//        iScanner.close();
//
//        String[] actions = new String[]{"+","-","*","/"};
//        String result = result(str_input, actions);
//        System.out.println(result);
//
//        String string_for_log = String.format("Действие %s Результат %s", str_input, result);
//        log(string_for_log);
//
//    }
//    static String result(String str_input, String[] actions){
//
//        for (String action : actions) {
//            int index_action = str_input.indexOf(action);
//            if (index_action != -1){
//                float operand_1 = Float.parseFloat(str_input.substring(0,index_action));
//                float operand_2 = Float.parseFloat(str_input.substring(index_action+1,str_input.length()));
//
//                switch (action) {
//                    case  ("+"):
//                        return String.valueOf(operand_1 + operand_2);
//                    case ("-"):
//                        return String.valueOf(operand_1 - operand_2);
//                    case ("*"):
//                        return String.valueOf(operand_1 * operand_2);
//                    case ("/"):
//                        return String.valueOf(operand_1 / operand_2);
//                }
//            }
//        }
//        return "null";
//    }
//
//    static void log(String message){
//        Logger logger = Logger.getLogger(main.class.getName());
//        logger.log(Level.WARNING, message);
//    }
//}