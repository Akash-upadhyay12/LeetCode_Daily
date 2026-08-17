class Solution {
    public int strStr(String s1, String s2) {
        if (s2.length() > s1.length()) {
            return -1;
        }

        int i = 0, j = 0, k = 0;

        while (i < s1.length() && j < s2.length()) {

            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } 
            else {
                j = 0;
                k++;
                i = k;
            }
        }

        if (j == s2.length()) {
            return k;
        }

        return -1;
    }
}