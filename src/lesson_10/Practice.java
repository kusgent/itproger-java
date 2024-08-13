package lesson_10;

public class Practice {

    public static void main(String[] args) {
        byte[] nums1 = new byte[] {5, 6, 7};
        int sum1 = sumArray(nums1);
        System.out.println("Сумма 1: " + sum1);

        byte[] nums2 = new byte[] {6, 7, 8, 34, 126};
        int sum2 = sumArray(nums2);
        System.out.println("Сумма 2: " + sum2);
    }

    public static int sumArray(byte[] arr) {
        int sum = 0;
        for (byte b : arr) sum += b;
        return sum;
    }
}
