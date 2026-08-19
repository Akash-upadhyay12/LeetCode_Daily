class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if(ch != '#') {
                int z = ch - '0';
                char c = (char)('a' + z -1);
                sb.append(c);
            }
            else if(ch == '#') {
                int a = s.charAt(i - 1) - '0';
                int b = s.charAt(i - 2) - '0';
                int c = a + 10 * b;
                char c2 = (char)('a' + c - 1);
                sb.append(c2);
                i -= 2;
            }
        }
        sb = sb.reverse();

        return sb.toString().trim();
    }
}