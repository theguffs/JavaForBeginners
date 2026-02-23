import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
public class FunctionalProgrammingMagic {
    public List<Integer> filterOddNumbers(List<Integer> numbers) {
        return numbers.stream()
        .filter(n -> n % 2 != 0)
        .collect(Collectors.toList());
    }
}