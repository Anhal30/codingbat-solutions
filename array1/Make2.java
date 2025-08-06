public class Make2 {
    public static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int i = 0;

        if (a.length > 0) result[i++] = a[0];
        if (a.length > 1) result[i++] = a[1];

        for (int j = 0; i < 2 && j < b.length; j++) {
            result[i++] = b[j];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] result = make2(new int[]{4}, new int[]{1, 2, 3});  // [4, 1]
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}

