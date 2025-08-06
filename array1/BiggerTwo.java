public class BiggerTwo {
    public static int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        if (sumB > sumA) return b;
        return a;
    }

    public static void main(String[] args) {
        int[] result = biggerTwo(new int[]{1, 2}, new int[]{3, 4}); // [3, 4]
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
