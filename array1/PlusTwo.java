public class PlusTwo {
    public static int[] plusTwo(int[] a, int[] b) {
        return new int[] {a[0], a[1], b[0], b[1]};
    }

    public static void main(String[] args) {
        int[] result = plusTwo(new int[]{1, 2}, new int[]{3, 4}); // [1, 2, 3, 4]
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}

