public class BiNumber2 {
    private int number1;
    private int number2;
    public BiNumber2(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public BiNumber2(BiNumber2 other) {
        this.number1 = other.number1;
        this.number2 = other.number2;
    }
    public int getNumber1() {
        return number1;
    }
    public int getNumber2() {
        return number2;
    }

    public int calculateGCD() {
        if (number1 < 0 || number2 < 0) {
            return -1;
        }
        if (number1 == 0 || number2 == 0) {
            return 0;
        }
        if (number1 == number2) {
            return number1;
        }
        int min = Math.min(number1, number2);
        int gcd = min;
        for (int i = min; i > 0; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }}

