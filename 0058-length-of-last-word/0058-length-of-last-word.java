class Solution {
    public int lengthOfLastWord(String s) {
       String w = s.trim();
       int count = 0;
       for(int i = w.length()-1; i>=0; i--){
        if(w.charAt(i) == ' '){
            break;
        }
        else{
            count++;
        }
       }
       return count;
    }
}