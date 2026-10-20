class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapped_values = new HashMap<>();
        mapped_values.put(')', '(');
        mapped_values.put(']', '[');
        mapped_values.put('}', '{');

        for (char c : s.toCharArray()) {
            if (mapped_values.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == mapped_values.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
