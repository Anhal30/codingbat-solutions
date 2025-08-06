public class MiddleWay {
    public static int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }

    public static void main(String[] args) {
        int[] result = middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6});  // [2, 5]
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
