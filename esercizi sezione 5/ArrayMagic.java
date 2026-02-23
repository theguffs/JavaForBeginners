public class ArrayMagic {
    public boolean doesHaveElementGreaterThan(int[] array, int value) {
        if (array == null || array.length == 0) {
            return false;
        }
        for (int element : array) {
            if (element > value) {
                return true;
            }
        }
        return false;
    }
}