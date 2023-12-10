package homework_07_12_2023.task1;

public class Task1 {
    public static void main(String[] args) {
        isDegreeTwo(8);
        isDegreeTwo(16);
        isDegreeTwo(15);
        isDegreeTwo(21);
    }

    public static void isDegreeTwo(double num) {
        if (num == 1) {
            System.out.println("YES");
            return;
        } else if (num < 1) {
            System.out.println("NO");
            return;
        }

        isDegreeTwo(num/2);
    }
}
