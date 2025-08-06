public class MakeLast {
    public static int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }

    public static void main(String[] args) {
        int[] result = makeLast(new int[]{4, 5, 6}); // [0, 0, 0, 0, 0, 6]
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
