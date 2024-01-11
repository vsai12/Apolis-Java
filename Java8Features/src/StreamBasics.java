import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasics {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            nums.add(i);
        }

        List<Integer> oddSquares = nums.stream().filter(
                n -> n % 2 == 1
        ).map(n -> n * n).collect(Collectors.toList());

        System.out.println(oddSquares);
    }
}
