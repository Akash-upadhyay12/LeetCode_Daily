class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String [] word = s.split(" ");

        for(int i = 0; i<k; i++){
            sb.append(word[i] + " ");
        }
        return sb.toString().trim();



        

        

        
    }
}