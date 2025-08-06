public class MakeEnds {
    public static int[] makeEnds(int[] nums) {
        return new int[] {nums[0], nums[nums.length - 1]};
    }

    public static void main(String[] args) {
        int[] result = makeEnds(new int[]{1, 2, 3}); // [1, 3]
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
