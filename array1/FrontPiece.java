public class FrontPiece {
    public static int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            return new int[] {nums[0], nums[1]};
        } else if (nums.length == 1) {
            return new int[] {nums[0]};
        } else {
            return new int[] {};
        }
    }

    public static void main(String[] args) {
        int[] result = frontPiece(new int[]{1, 2, 3});
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
