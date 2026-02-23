import java.util.List;

public class FunctionalProgrammingMagic4 {

    public static long sumOfSquares(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        return numbers.stream()
        .map(n -> n * n)
        .reduce(0, (a, b) -> a + b);
    }
}