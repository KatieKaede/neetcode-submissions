class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> visited = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];

            // have we seen the needed number?
            if (visited.containsKey(diff)) {
                return new int[]{visited.get(diff), i + 1};
            }

            // if not, add it to the HashMap, index + 1
            visited.put(numbers[i], i + 1);
        }
        return new int[]{};
    }
}
