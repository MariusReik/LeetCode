class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder newS = new StringBuilder();
            for (int i = 0; i < s.length(); i += k) {
                String group = s.substring(i, Math.min(i + k, s.length()));
                int sum = 0;
                for (char c : group.toCharArray()) {
                    sum += c - '0';
                }
                newS.append(sum);
            }
            s = newS.toString();
        }
        return s;
    }
}