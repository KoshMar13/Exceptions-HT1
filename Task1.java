package HT.HT1;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Task1 {
    public static void main(String[] args) {
        // method1();
        // method2();
        method3();
    }

    public static void method1() {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    public static void method2() {
        String[] arr = new String[10];
        System.out.println(arr[10]);
    }

    public static void method3() {
        String[] arr = new String[10];
        int a = 10;
        arr[2] = a;
    }

}
