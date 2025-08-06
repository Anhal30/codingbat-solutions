public class Reverse3 {
    public static int[] reverse3(int[] nums) {
        return new int[] {nums[2], nums[1], nums[0]};
    }

    public static void main(String[] args) {
        int[] result = reverse3(new int[]{1, 2, 3});  // [3, 2, 1]
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
