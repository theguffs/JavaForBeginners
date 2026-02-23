import java.util.ArrayList;
import java.util.List;

public class NumberMagic2 {
    public List<Integer> determineMultiples(int number) {
        if (number <= 0 || limit <= 0) {
            return multiples;
        }
        for (int i = 1; i <= limit; i++) {
            if (i % number == 0) {
                multiples.add(i);
            }
        }
        return multiples;
    }
}