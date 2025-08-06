public class MakeMiddle {
    public static int[] makeMiddle(int[] nums) {
        int mid = nums.length / 2;
        return new int[] {nums[mid - 1], nums[mid]};
    }

    public static void main(String[] args) {
        int[] result = makeMiddle(new int[]{1, 2, 3, 4}); // [2, 3]
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
