public class MidThree {
    public static int[] midThree(int[] nums) {
        int mid = nums.length / 2;
        return new int[] {nums[mid]};
    }

    public static void main(String[] args) {
        int[] result = midThree(new int[]{1, 2, 3}); // [2]
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
