public class SwapEnds {
    public static int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public static void main(String[] args) {
        int[] result = swapEnds(new int[]{1, 2, 3, 4});
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
