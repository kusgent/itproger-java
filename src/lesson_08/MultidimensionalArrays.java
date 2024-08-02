package lesson_08;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        char[][] syms = new char[2][2];
        syms[0][0] = 't';
        System.out.println(syms[0][0]);
        byte[][] nums = new byte[][] {
                {5, 6},
                {3, 9},
                {-3, 4}
        };
        System.out.println(nums[2][0]);
        nums[2][0] = 7;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
