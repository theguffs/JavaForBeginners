public class MyString {
    public String str;
    public MyString(String str) {
        this.str = str;
    }
    public boolean isHexadecimalChar(char ch) {
        if (ch >= '0' && ch <= '9') {
            return true;
        }
        else if (ch >= 'a' && ch <= 'f') {
            return true;
        }
        else if (ch >= 'A' && ch <= 'F') {
            return true;
        }
        else {
            return false;
        }
    }
    private boolean isHexadecimal() {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!isHexadecimalChar(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public boolean isHexadecimal() {
        return isHexadecimal(str);
    }
}