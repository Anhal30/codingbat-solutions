public class Front11 {
    public static int[] front11(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) {
            return new int[] {a[0], b[0]};
        } else if (a.length > 0) {
            return new int[] {a[0]};
        } else if (b.length > 0) {
            return new int[] {b[0]};
        } else {
            return new int[] {};
        }
    }

    public static void main(String[] args) {
        int[] result = front11(new int[]{1, 2, 3}, new int[]{7, 9, 8}); // [1, 7]
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
