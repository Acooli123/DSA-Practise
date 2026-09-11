import java.util.*;

class IsSortedArray {
    public static  boolean isSorted(ArrayList<Integer> nums) {

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(2);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);

        System.err.println(isSorted(nums));
    }
}
