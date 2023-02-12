//1. Вычислить n-ое треугольное число (сумма чисел от 1 до n), n!(произведение чисел от 1 до n).

import java.util.Scanner;

public class Program {
     public static void main(String[] args) {

         int number = getInt("Enter number");
         int factorial = factor(number);
         int triangle = triangle(number);
         System.out.printf("---------\nFactorial %d = %d\n", number, factorial);
         System.out.printf("---------\nTriangle %d = %d\n", number, triangle);
     }

    private static int triangle(int n) {
         return n*(n+1)/2;
    }

    static int getInt(String text) {
         Scanner in = new Scanner(System.in);
         System.out.println(text);
         int num = in.nextInt();
         in.close();
         return num;
     }
     static int factor(int x) {
         int factor_ = 1;
         for (int i = 1; i <= x; i++) {
             factor_ = factor_ * i;
         }
         return factor_;
     }
}

//2. Вывести все простые числа от 1 до 1000.
// public class Program {
//    public static void main(String[] args) {
//        int max = 100;
//        for (int i = 1; i <= max; i++) {
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) break;
//                if (!((j+1) < i)) System.out.printf("%d ",i);
//            }
//        }
//    }
// }

//3. Реализовать простой калькулятор.
// import java.util.Scanner;
// public class Program {
//    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        int a = iScanner.nextInt();
//        System.out.printf("int b: ");
//        int b = iScanner.nextInt();
//        iScanner.close();
//        System.out.printf("sum of %d and %d = %d\n", a, b, a + b);
//    }
// }

//4. Уравнение вида q + w = e; q,w,e >= 0; 2? + ?5 = 69. Предложить решение.
// public class Program {
//    public static void main(String[] args) {
//        String q = "2x";
//        String w = "y5";
//        int e = 69;

//        for (int x = 0; x <= 9; x++) {
//            int str_q = Integer.parseInt(q.replace("x", Integer.toString(x)));
//            for (int y = 0; y <= 9; y++) {
//                int str_w = Integer.parseInt(w.replace("y", Integer.toString(y)));
//                if (str_q + str_w == e){
//                    System.out.printf("Formula 2? + ?5 = 69 result: first'?' = %d, second'?' = %d\n", x, y);
//                }
//            }
//        }
//    }
// }