public class MiddleThree {
    public static String middleThree(String str) {
        int mid = str.length() / 2; // نحسب منتصف السلسلة
        return str.substring(mid - 1, mid + 2); // نرجّع الثلاثة الأحرف الوسطى
    }
}
