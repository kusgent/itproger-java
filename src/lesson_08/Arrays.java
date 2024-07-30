package lesson_08;

public class Arrays {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 45;
        nums[1] = 4;
        nums[2] = 36;
        nums[3] = 94;
        nums[4] = 3;
        int res = nums[1] + nums[3];
        System.out.println(nums[0]);
        System.out.println(res);
        float[] nums2 = new float[] {3.5f, 44.877f, 5.21f};
        System.out.println(nums2[1]);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Element " + nums[i]);
        }
    }
}
