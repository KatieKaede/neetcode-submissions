class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";

        StringBuilder builder = new StringBuilder();
        ArrayList<Integer> sizes = new ArrayList<>();

        for (String str : strs) {
            sizes.add(str.length());
        }

        for (int i = 0; i < strs.size(); i++) {
            builder.append(strs.get(i).length());
            builder.append(',');
            }

        builder.append('#');
        for (int i = 0; i < strs.size(); i++) {
            builder.append(strs.get(i));
        }

        String result = builder.toString();
        return result;
    }

    public List<String> decode(String str) {
        if (str.length() == 0) {
            return new ArrayList<>();
        }

        List<String> final_result = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();

        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder current = new StringBuilder();
            while (str.charAt(i) != ',') {
                current.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(current.toString()));
            i++;
        }
        i++;
        for (int size : sizes) {
            final_result.add(str.substring(i, i + size));
            i += size;
        }
        return final_result;
    }
}
