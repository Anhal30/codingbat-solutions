public class MaxTriple {
    public static int maxTriple(int[] nums) {
        int first = nums[0];
        int mid = nums[nums.length / 2];
        int last = nums[nums.length - 1];
        return Math.max(first, Math.max(mid, last));
    }

    public static void main(String[] args) {
        System.out.println(maxTriple(new int[]{1, 2, 3}));       // 3
        System.out.println(maxTriple(new int[]{1, 5, 3}));       // 5
        System.out.println(maxTriple(new int[]{5, 2, 9, 1, 5})); // 5
    }
}
