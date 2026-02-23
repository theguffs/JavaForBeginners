import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgrammingMagic2 {
    public static List<Integer> getCubesOfFirsNNumbers(int n) {
        intStream.range(1, n+1)
        .map(i -> i * i * i)
        .boxed()
        .collect(Collectors.toList());
        return cubes;
    }
}