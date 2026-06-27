class Solution {
    public boolean canConstruct(String rn, String m) {
        int [] freq = new int[26];

        for(int i = 0; i<m.length(); i++){
            freq[m.charAt(i)-'a']++;

        }
        for(int i = 0; i<rn.length(); i++){
            freq[rn.charAt(i)-'a']--;
            if(freq[rn.charAt(i)-'a']<0){
                return false;
            }           
        }
        return true;


        
    }
}