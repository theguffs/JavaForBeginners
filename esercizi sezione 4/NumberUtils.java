
public class NumberUtils {
    public int getLastDigit(int number) {
        if (number < 0) {
         return -1;
        }
        else {
         int lastDigit = number % 10;
            return lastDigit;
}
    }
}
