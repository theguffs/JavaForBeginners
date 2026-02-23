import java.until.Array;

public class StringMagic {
    public boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
       if(str1.length() != str2.length()) {
        return false;
       }
       String lowerStr1 = str1.toLowerCase();
       String lowerStr2 = str2.toLowerCase();
       char[] charArray1 = lowerStr1.toCharArray();
       char[] charArray2 = lowerStr2.toCharArray();
       Arrays.sort(charArray1);
       Arrays.sort(charArray2);
       return Arrays.equals(charArray1, charArray2);
    }
}