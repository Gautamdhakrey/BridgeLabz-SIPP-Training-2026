package Sorting;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        int swapCount = 0;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {

            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapCount++;
                    swapped = true;
                }
            }

            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);

            if (!swapped) {
                System.out.println("Array is already sorted.");
                break;
            }
        }

        System.out.println("Total Swaps = " + swapCount);
    }

    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] marks = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(marks);

        bubbleSort(marks);

        System.out.println("Sorted Array:");
        printArray(marks);
    }
}