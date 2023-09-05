package time;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ContainsDuplicateTimeTest {
    public static void main(String[] args) {
        int[] input = new int[] {1,5,-2,-4,0};

        Thread thread1 = new Thread() {
            public void run() {
                long startTime = System.nanoTime();
                containsDuplicateBruteForce(input);
                long endTime = System.nanoTime();
        
                long total = endTime - startTime;
                System.out.println("Brute-force solution: " + total + " ms");
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                long startTime = System.nanoTime();
                containsDuplicateHashSet(input);
                long endTime = System.nanoTime();
        
                long total = endTime - startTime;
                System.out.println("HashSet solution: " + total + " ms");
            }
        };

        Thread thread3 = new Thread() {
            public void run() {
                long startTime = System.nanoTime();
                containsDuplicateHashMap(input);
                long endTime = System.nanoTime();
        
                long total = endTime - startTime;
                System.out.println("HashMap solution: " + total + " ms");
            }
        };

        thread1.start();
        thread2.start();
        thread3.start();
    }

    private static boolean containsDuplicateBruteForce(int[] nums) {

        List<Integer> addedNums = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < addedNums.size(); j++) {
                if (addedNums.contains(nums[i])) return true;
            }
            addedNums.add(nums[i]);
        }

        return false;
      }

    private static boolean containsDuplicateHashMap(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                return true;
            }

            hashMap.put(nums[i], 0);
        }

        return false;  
    }

    private static boolean containsDuplicateHashSet(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }

        if (hashSet.size() != nums.length) return true;

        return false;
    }
}
