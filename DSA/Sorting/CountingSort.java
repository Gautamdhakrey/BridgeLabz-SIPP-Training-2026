package Sorting;

public class CountingSort {

    static void countingSort(int[] arr) {

        int[] count = new int[21];

        for (int x : arr)
            count[x]++;

        int index = 0;

        for (int i = 1; i <= 20; i++) {

            while (count[i] > 0) {

                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {

        int[] genre = {5, 1, 7, 5, 20, 3, 2, 7, 1};

        countingSort(genre);

        for (int x : genre)
            System.out.print(x + " ");
    }
}