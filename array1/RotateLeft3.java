public class RotateLeft3 {
    public static int[] rotateLeft3(int[] nums) {
        return new int[] {nums[1], nums[2], nums[0]};
    }

    public static void main(String[] args) {
        int[] result = rotateLeft3(new int[]{1, 2, 3});  // [2, 3, 1]
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
