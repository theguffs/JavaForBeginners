public class NumberUtils3 {
    public int getSumOfDigits(int number) {
        if (number < 0) {
            return -1;
        }
        else if (number == 0) {
            return 0;
        }
        else {
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            return sum;
        }
    }
}