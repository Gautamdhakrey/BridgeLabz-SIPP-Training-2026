package SlidingWindow;

public class MaxSubArrayOfSizeK {

    public static int maxSubarrayOfSizeK(int[] cpuLoad, int k) {

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;

        for(int end = 0; end < cpuLoad.length; end++) {

            windowSum += cpuLoad[end];

            if(end >= k - 1) {

                maxSum = Math.max(maxSum, windowSum);

                windowSum -= cpuLoad[start];

                start++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] cpuLoad = {4, 2, 1, 7, 8, 1, 2, 8, 1};

        int k = 3;

        int max = maxSubarrayOfSizeK(cpuLoad, k);

        System.out.println("Maximum Sum = " + max);
    }
}