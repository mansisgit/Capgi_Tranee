import java.util.*;

public class MinAbsDiff {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3};
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                System.out.println(arr[i - 1] + " " + arr[i]);
            }
        }
    }
}

