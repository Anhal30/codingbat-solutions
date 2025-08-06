public class NearTen {
    public static boolean nearTen(int num) {
        int mod = num % 10;
        return (mod <= 2 || mod >= 8);
    }

    public static void main(String[] args) {
        System.out.println(nearTen(12)); // true
        System.out.println(nearTen(17)); // false
        System.out.println(nearTen(19)); // true
    }
}
