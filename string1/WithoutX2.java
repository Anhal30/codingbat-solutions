public class WithoutX2 {
    public String withoutX2(String str) {
        String result = str;
        if (str.length() >= 1 && str.charAt(0) == 'x') {
            result = result.substring(1);
        }
        if (result.length() >= 1 && str.length() >= 2 && str.charAt(1) == 'x') {
            result = result.substring(0, 1) + result.substring(2);
        }
        return result;
    }
}
