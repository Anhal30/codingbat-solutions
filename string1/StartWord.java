public class StartWord {
    public String startWord(String str, String word) {
        if (word.length() > str.length()) return "";
        String subStr = str.substring(1, word.length());
        String subWord = word.substring(1);
        if (subStr.equals(subWord)) {
            return str.substring(0, word.length());
        }
        return "";
    }
}
