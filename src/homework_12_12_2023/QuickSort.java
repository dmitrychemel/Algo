package homework_12_12_2023;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] testArray = {39, 22, 2, 55, 6, 20};
        quickSort(testArray, 0, testArray.length - 1);
        System.out.println(Arrays.toString(testArray));
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int indexPivot = partition(array, start, end);
            quickSort(array, start, indexPivot - 1);
            quickSort(array, indexPivot + 1, end);
        }
    }

    public static int partition(int[] array, int start, int end) {
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

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
