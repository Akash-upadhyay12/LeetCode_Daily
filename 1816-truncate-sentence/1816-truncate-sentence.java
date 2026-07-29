class Solution {
    public String truncateSentence(String w, int k) {
        StringBuilder sb = new StringBuilder();
        String [] s = w.split(" ");
        for(int i = 0; i<k; i++){
            sb.append(s[i] + " ");
        }
        return sb.toString().trim();
        
    }
}