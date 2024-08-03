package lesson_09;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1,35);
        System.out.println(numbers.size());
        System.out.println(numbers.get(2));
        for (Integer el : numbers) {
            System.out.print(el + " ");
        }
        System.out.println();
        numbers.remove(2);
        System.out.println(numbers.size());
        numbers.clear();
        System.out.println(numbers.size());

        LinkedList<Float> nums = new LinkedList<>();
        nums.add(5.6f);
        nums.add(7.24f);
        nums.add(5.63f);
        nums.add(2.6f);
        nums.add(89.345f);
        for (Float el : nums) {
            System.out.print(el + " ");
        }
    }
}
