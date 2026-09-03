class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        int [] freq1 = new int[26];
        int [] freq2 = new int[26];
        for(int x = 0; x<s1.length(); x++){
            freq1[s1.charAt(x)-'a']++;
        }
        for(int x = 0; x<s2.length(); x++){
            freq2[s2.charAt(x)-'a']++;
        }
        if(!Arrays.equals(freq1, freq2)){
            return false;
        }

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < s1.length() && j < s2.length()){
            if(s1.charAt(i) != s2.charAt(j)){
                if(k < 2){
                    i++;
                    j++;
                    k++;
                }
                else{
                    return false;
                }
            }
            else{
                i++;
                j++;
            }
        }
        return true;
    }
}