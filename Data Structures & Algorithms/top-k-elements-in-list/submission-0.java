class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> frequencies = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!frequencies.containsKey(nums[i])) {
                frequencies.put(nums[i], 1);
            } else {
                frequencies.put(nums[i], frequencies.get(nums[i]) + 1);
            }
        }

        for (int i = 0; i < k; i++) {
            int max = 0;
            int maxKey = 0;

            for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    maxKey = entry.getKey();
                }
            }

            result[i] = maxKey;
            frequencies.remove(maxKey);
        }

        return result;
    }
}