package BinarySearch;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] stars = {5, 10, 15, 20, 25, 30, 35, 40};

        int target = 25;

        int index = binarySearch(stars, target);

        if (index == -1)
            System.out.println("Element Not Found");
        else
            System.out.println("Element Found at Index: " + index);
    }
}