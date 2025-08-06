public class MakePi {
    public static int[] makePi() {
        return new int[] {3, 1, 4};
    }

    public static void main(String[] args) {
        int[] pi = makePi();
        for (int num : pi) {
            System.out.print(num + " "); // 3 1 4
        }
    }
}
