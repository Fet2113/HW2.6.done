import java.util.*;

public class Task {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
       task1(nums);
        task2(nums);
        List<String> word = new ArrayList<>(List.of("geg", "veg", "peg", "geg", "veg", "peg", "huh"));
        task3(word);
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        task3(strings);
    }

    public static void task1(List<Integer> nums) {
        for (Integer i : nums) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void task2(List<Integer> nums) {
        Set<Integer> IntegerSet = new TreeSet<>(nums);
        for (Integer i : IntegerSet) {
            if (i % 2 == 0) {
                System.out.println(i);

//        Collections.sort(nums);
//        int pNum = Integer.MIN_VALUE;
//       for (Integer i : nums) {
//            if (i % 2 == 0 && i != pNum) {
//                System.out.println(i);
//                pNum = i;
            }

        }

    }

    public static void task3(List<String> word) {
        System.out.println(new HashSet<>(word));
    }

    public static void task4(List<String> strings) {
        Set<String> unStrings = new HashSet<>(strings);
        System.out.println(strings.size() - unStrings.size());
            }
        }





