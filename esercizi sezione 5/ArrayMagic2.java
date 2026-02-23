public class ArrayMagic2 {
    public int findSecondLargest(int[] array) {
        if (array == null || array.length < 2) {
            return -1;
        }
        int largest = array[0];
        int secondLargest = array[1];
        for (int i = 2; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            }
        }
    }