package Sorting;

public class SelectionSort {

    public static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);
        }
    }

    public static void printArray(int[] arr) {

        for (int num : arr)
            System.out.print(num + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        int[] scores = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(scores);

        selectionSort(scores);

        System.out.println("Sorted Array:");
        printArray(scores);
    }
}