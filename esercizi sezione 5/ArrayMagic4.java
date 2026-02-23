public class ArrayMagic4 {
    public int[] reverseArray(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        int start=0;
        int end=array.length-1;
        while (start<end) {
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        return array;
    }
}