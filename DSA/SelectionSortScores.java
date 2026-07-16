import java.util.Arrays;

public class SelectionSortScores {

    public static void selectionSort(int[] scores) {

        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {

                if (scores[j] < scores[min]) {
                    min = j;
                }
            }

            int temp = scores[i];
            scores[i] = scores[min];
            scores[min] = temp;
        }
    }

    public static void main(String[] args) {

        int[] scores = {89, 56, 91, 34, 78};

        selectionSort(scores);

        System.out.println(Arrays.toString(scores));
    }
}