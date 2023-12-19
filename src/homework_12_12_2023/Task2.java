package homework_12_12_2023;

public class Task2 {
//    Решите задачу: Расставьте в алфавитном порядке буквы. Разрешается использование техники Разделяй и властвуй. Полученные данные напечатайте.
//    На вход строка: "poiuytrewqlkjhgfdsamnbvcxz"
//    На выходе должно быть: ABCDEFGHIJKLMNOPQRSTUVWXYZ (с большой буквы)

    public static void main(String[] args) {
        String str = "poiuytrewqlkjhgfdsamnbvcxz".toUpperCase();

        sortString(str);
    }

    public static void sortString(String str) {
        char[] chars = str.toCharArray();

        quickSort(chars, 0, chars.length - 1);
        System.out.println(printString(chars));
    }

    public static void quickSort(char[] array, int start, int end) {
        if (start < end) {
            int indexPivot = partition(array, start, end);
            quickSort(array, start, indexPivot - 1);
            quickSort(array, indexPivot + 1, end);
        }
    }

    public static int partition(char[] array, int start, int end) {
        int pivot = array[end];
        int indexPivot = start;

        for (int i = start; i < end; i++) {
            if(array[i] <= pivot) {
                swap(array, i, indexPivot);
                indexPivot++;
            }
        }
        swap(array, end, indexPivot);

        return indexPivot;
    }

    public static void swap(char[] array, int first, int second) {
        char temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static String printString(char[] array) {
        StringBuilder sb = new StringBuilder();
        for(char ch : array) {
            sb.append(ch);
        }

        return sb.toString();
    }
}
