package homework_07_12_2023.task2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(sumNumbers(179));
        System.out.println(sumNumbers(985));
    }

    public static int sumNumbers(int number) {
        if (number == 0) {
            return 0;
        }

        return number % 10 + sumNumbers(number / 10);
    }
}
