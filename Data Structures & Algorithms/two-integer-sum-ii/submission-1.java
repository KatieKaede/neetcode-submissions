class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> differences = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];

            // have we previously seen the needed number?
            if (differences.containsKey(diff)) {
                return new int[]{differences.get(diff), i + 1};
                
            }
            // store the visited number and its index
            differences.put(numbers[i], i + 1);
        }
        return new int[]{};
    }
}
