class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for(String c : words){
            if(s.startsWith(c)){
                count++;
            }
        }
        return count;

        
    }
}