package Sorting;

public class InsertionSort {

    public static void insertionSort(int[] arr) {

        int shiftCount = 0;

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
                shiftCount++;
            }

            arr[j + 1] = key;

            System.out.print("Pass " + i + ": ");
            printArray(arr);
        }

        System.out.println("Total Shifts = " + shiftCount);
    }

    public static void printArray(int[] arr) {

        for (int num : arr)
            System.out.print(num + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        int[] employeeIds = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(employeeIds);

        insertionSort(employeeIds);

        System.out.println("Sorted Array:");
        printArray(employeeIds);
    }
}