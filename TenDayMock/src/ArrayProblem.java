import java.util.Arrays;

public class ArrayProblem {
    static int maxDiff(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];
    }
}
