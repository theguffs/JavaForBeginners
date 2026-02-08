
public class NumberUtilis4 {
    public int getReverseNumber(int number) {
        if (number < 0) {
            return -1;
        }
        else if (number == 0) {
            return 0;
        }
        else {
            int reverseNumber = 0;
            while (number > 0) {
                int digit = number % 10;
                reverseNumber = reverseNumber * 10 + digit;
                number /= 10;
                System.out.printf("digit-%d, number-%d, reverseNumber-%d", digit, number, reverseNumber).println();
            }
            return reverseNumber;
        }
    }
}
