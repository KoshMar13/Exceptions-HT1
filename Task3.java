package HT.HT1;

import java.util.*;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Вместо массива может прийти null (обработать).

public class Task3 {
    static Scanner sc = new Scanner(System.in, "ibm866");

    public static void main(String[] args) {
        int[] arr1 = createArr();
        int[] arr2 = createArr();
        System.out.println(Arrays.toString(arrDiffer(arr1, arr2)));
    }

    public static int[] createArr() {
        System.out.print("Insert array's length: ");
        int len = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(1001);
        }
        return arr;
    }

    public static int[] arrDiffer(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays must be equal");
        }
        int[] ans = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            ans[i] = arr1[i] - arr2[i];
        }
        return ans;
    }
}
