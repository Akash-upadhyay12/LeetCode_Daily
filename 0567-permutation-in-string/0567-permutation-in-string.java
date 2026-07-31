import java.util.Arrays;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int [] freq1 = new int[26];
        for(int i = 0; i<s1.length(); i++){
            freq1[s1.charAt(i)-'a']++;
        }
        int i = 0;
        int j = s1.length()-1;
        while(j<s2.length()){
            int [] freq2 = new int[26];
            for(int k = i; k<=j; k++){
                freq2[s2.charAt(k)-'a']++;
            }
            if(Arrays.equals(freq1, freq2)){
                return true;
            }
            i++;
            j++;
            
        }
        return false;

        
    }
}