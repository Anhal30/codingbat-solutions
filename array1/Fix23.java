public class Fix23 {
    public static int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] result = fix23(new int[]{1, 2, 3}); // [1, 2, 0]
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
