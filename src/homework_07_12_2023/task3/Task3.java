package homework_07_12_2023.task3;

public class Task3 {

    public static void main(String[] args) {
        fibonacci(10);
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            return 0;
        }
        System.out.print(fibonacciNumber(n) + " ");
        fibonacci(n - 1);
        return n;
    }

    public static int fibonacciNumber(int n) {
        int sum = 0;
        if (n <= 1) {
            return n;
        }

        return fibonacciNumber(n - 2) + fibonacciNumber(n - 1);
    }
}
