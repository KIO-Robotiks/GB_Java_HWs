 import java.util.Arrays;

// public class Program {
//     public static void main(String[] args){
//         int[] arr = new int[] {1,3,8,3,2,2,3};
//         int[] temp = new int[arr.length];

//         int count = 0;
//         for (int i = 0; i < arr.length; i++){
//             if (arr[i] == 3) count ++;
//             else temp[i - count] = arr[i];
//             }
//         for (int j = 1; j < count+1; j++){
//             temp[temp.length - j] = 3;
//         }

//         System.out.println(Arrays.toString(temp));
//     }
// }


public class main {
    public static void main(String[] args){
        String my_str = "Добро пожаловать на курс по Java";
        String[] arr = my_str.split(" ");
        String temp = "";

        for (int i = 0; i < arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length -1 -i];
            arr[arr.length -1 -i] = temp;
        }
         my_str = String.join(" ", arr);
         System.out.println(my_str);
    }
}
