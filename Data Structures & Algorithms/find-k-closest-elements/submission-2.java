class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       List<Integer> list = new ArrayList<>();

        // Add all elements
        for (int num : arr) {
            list.add(num);
        }

        // Sort by:
        // 1. Distance from x
        // 2. Smaller number first if distance is equal
        list.sort((a, b) -> {
            int distA = Math.abs(a - x);
            int distB = Math.abs(b - x);

            if (distA != distB) {
                return Integer.compare(distA, distB);
            }

            return Integer.compare(a, b);
        });

        // Take k closest elements
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            result.add(list.get(i));
        }

        // Result must be in ascending order
        Collections.sort(result);

        return result;
    }
}
