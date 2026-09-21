class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += k) {
            int sum = 0;
            for (int j = i; j < Math.min(i + k, s.length()); j++) {
                char ch = s.charAt(j);
                int ans1 = (ch - 'a');
                sum += ans1;
            }
            int ans3 = sum % 26;
            if (ans3 == 0) {
                ans3 = 26;
            }
            char letter = (char)((ans3 % 26) + 'a');
            sb.append(letter);
        }
        return sb.toString();
    }
}