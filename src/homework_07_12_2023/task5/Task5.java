package homework_07_12_2023.task5;

public class Task5 {
    public static void main(String[] args) {
        int [] array =  {40, 250, 80, 88, 240, 12, 148};

        System.out.println(searchMin(array, 0, array.length - 1));
        System.out.println(searchMax(array, 0, array.length - 1));
    }

//    public static void search(int[] array, int start, int end) {
//    }

    public static int searchMin(int[] array, int start, int end) {
        if(start == end) {
            return array[start];
        }

        if(array[start] < array[end]){
            return searchMin(array, start, end - 1);
        } else {
            return searchMin(array, start + 1,end);
        }
    }

    public static int searchMax(int[] array, int start, int end) {
        if(start == end) {
            return array[start];
        }

        if(array[start] > array[end]){
            return searchMax(array, start, end - 1);
        } else {
            return searchMax(array, start + 1,end);
        }
    }

}
