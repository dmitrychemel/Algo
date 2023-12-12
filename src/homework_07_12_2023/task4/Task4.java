package homework_07_12_2023.task4;

public class Task4 {

    public static void main(String[] args) {

        System.out.println(isPalindrome("Lomafol"));
    }

    public static boolean isPalindrome(String word) {
        char[] chars = word.toLowerCase().toCharArray();

        return check(chars, 0, chars.length - 1);
    }

    public static boolean check(char[] chars, int start, int end) {
        if (start >= end) {
            return true;
        }
        return chars[start] == chars[end] && check(chars, start + 1, end - 1);
    }
}
