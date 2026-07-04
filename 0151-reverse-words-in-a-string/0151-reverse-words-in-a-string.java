class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String [] word = s.split(" ");
        for(int i = word.length-1; i>=0; i--){
            if(word[i].equals("")){
                continue;
            }
            else{
            
            sb.append(word[i] + " ");
            }
            


        }
        return sb.toString().trim();
        
    }
}