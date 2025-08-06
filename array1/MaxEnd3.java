public class MaxEnd3 {
    public static int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        return new int[] {max, max, max};
    }

    public static void main(String[] args) {
        int[] result = maxEnd3(new int[]{1, 2, 3});   // [3, 3, 3]
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
