public class NumberUtils2 {
    public int getNumberOfDigits(int number) {
        if (number < 0) {
            return -1;
        }
        else if (number == 0) {
            return 1;
        }
        else {
            int numberOfDigits = 0;
            while (number > 0) {
                number /= 10;
                numberOfDigits++;
            }
            return numberOfDigits;
        }
    }
}
