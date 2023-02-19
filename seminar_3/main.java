//        1.Реализовать алгоритм сортировки слиянием.
//public class main {
//
//    public static void main(String[] args) {
//
//        int[] arr = {7, 3, 9, 4, 8, 2, 6, 5};
//        main.sort(arr);
//        print(arr);
//
//    }
//     static void sort(int[] arr) {
//        int n = arr.length;
//        if (n < 2) {
//            return;
//        }
//        int mid = n / 2;
//        int[] leftArr = new int[mid];
//        int[] rightArr = new int[n - mid];
//        System.arraycopy(arr, 0, leftArr, 0, mid);
//        System.arraycopy(arr, mid, rightArr, 0, n - mid);
//
//        sort(leftArr);
//        sort(rightArr);
//        merge(leftArr, rightArr, arr);
//    }
//
//     static void merge(int[] leftArr, int[] rightArr, int[] arr) {
//        int leftLen = leftArr.length;
//        int rightLen = rightArr.length;
//        int i = 0, j = 0, k = 0;
//        while (i < leftLen && j < rightLen) {
//            if (leftArr[i] <= rightArr[j]) {
//                arr[k++] = leftArr[i++];
//            } else {
//                arr[k++] = rightArr[j++];
//            }
//        }
//        while (i < leftLen) {
//            arr[k++] = leftArr[i++];
//        }
//        while (j < rightLen) {
//            arr[k++] = rightArr[j++];
//        }
//    }
//    static void print(int[] arr){
//        for (int i: arr) {
//            System.out.printf("%d ", i);
//        }
//    }
//}

//        2.Пусть дан произвольный список целых чисел, удалить из него четные числа.

//import java.util.ArrayList;
//import java.util.List;
//
//public class main {
//
//    public static void main(String[] args) {
//
//        Integer[] arr = {6,3,8,11,22,44,56,77,213,447,800};
//        ArrayList<Integer> arrObj = new ArrayList<>(List.of(arr));
//        print(arrObj);
//        ArrayList<Integer> result = delEven(arr);
//        print(result);
//
//    }
//
//    private static ArrayList<Integer> delEven(Integer[] arr) {
//        ArrayList<Integer> result = new ArrayList<>();
//        for (int el: arr) {
//            if (el%2 != 0) result.add(el);
//        }
//        return result;
//    }
//
//    static void print(ArrayList<Integer> arr){
//        for (int i: arr) {
//            System.out.printf("%d ", i);
//        }
//        System.out.println();
//    }
//}

//        3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
//        Я решил в этой задаче всё-таки найти элемент наиболее приближенный к среднему арифметическому.

//import java.util.ArrayList;
//import java.util.Arrays;
//
//import static java.util.Collections.max;
//import static java.util.Collections.min;
//
//public class main {
//
//    public static void main(String[] args) {
//
//        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(6,3,8,11,22,44,56,77,213,447,800));
//
//        int min = min(arr);
//        int max = max(arr);
//        int middle = middle(arr);
//
//        print(arr);
//        System.out.printf("minimal = %d; maximal = %d; middle = %d", min, max, middle);
//
//    }
//
//    private static int middle(ArrayList<Integer> arr) {
//        int middle = arr.get(0);
//        int sum = 0;
//        for (int el: arr) {
//            sum += el;
//        }
//        float absolutMiddle = sum / arr.size();
//
//        float deff = absolutMiddle - middle;
//        for (int el: arr){
//            float currentDeff = Math.abs(absolutMiddle - el);
//            if (currentDeff < deff) {
//                deff = currentDeff;
//                middle = el;
//            }
//        }
//        return middle;
//    }
//
//    static void print(ArrayList<Integer> arr){
//        for (int i: arr) {
//            System.out.printf("%d ", i);
//
//        }
//        System.out.println();
//    }
//}