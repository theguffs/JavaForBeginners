import java.util.List;
import java.util.Optional;

public class FunctionalProgrammingMagic5 {
    public static int findMaxEvenNumber(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        return numbers.stream()
        .filter(n -> n % 2 == 0)
        .max(Integer::compareTo)
        .orElse(0);
    }
}