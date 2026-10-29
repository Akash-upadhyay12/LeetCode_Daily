class Solution {
    public String resultingString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (sb.length() == 0) {
                sb.append(ch);
            } 
            else if ((ch == 'a' && sb.charAt(sb.length() - 1) == 'z') || 
                     (ch == 'z' && sb.charAt(sb.length() - 1) == 'a')) {
                sb.deleteCharAt(sb.length() - 1);
            } 
            else {
                int a = sb.charAt(sb.length() - 1) - 'a' + 1;
                int b = ch - 'a' + 1;
                
                if (Math.abs(a - b) == 1) {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    sb.append(ch); 
                }
            }
        }
        return sb.toString();
    }
}
