package HT.HT1;

import java.util.*;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше

public class Task4 {
    static Scanner sc = new Scanner(System.in, "ibm866");

    public static void main(String[] args) {
        int[] arr1 = createArr();
        int[] arr2 = createArr();
        System.out.println("Catch exeption: " + e.getClass().getSimpleName());
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

    public static int[] arrDivide(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new RuntimeException("Arrays must not be empty");
        }
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays must be equal");
        }
        int[] ans = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            valid(arr2[i]);
            ans[i] = arr1[i] / arr2[i];
        }
        return ans;
    }

    public static void valid(int number) {
        if (number == 0) {
            throw new RuntimeException("Sorry, I can't divide by zero!");
        }
    }
}
