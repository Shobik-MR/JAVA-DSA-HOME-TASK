import java.util.*;

class UniqueOccurance {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> result = new HashMap<>();

        // Count frequency
        for (int x : arr) {
            result.put(x, result.getOrDefault(x, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        // Check whether frequencies are unique
        for (int frequency : result.values()) {

            if (set.contains(frequency)) {
                return false;
            }

            set.add(frequency);
        }

        return true;
    }
}