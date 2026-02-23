import java.util.List;
import java.util.stream.Collectors;
public class FunctionalProgrammingMagic3 {
    public static List<String> getCursenCharactersCount(List<String> courses) {
        if (courses == null || courses.isEmpty()) {
            return List.of();
        }
        return courses.stream()
        .map(course -> course.length())
        .collect(Collectors.toList());
    }
}