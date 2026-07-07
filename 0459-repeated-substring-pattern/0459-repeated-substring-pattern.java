class Solution {
    public boolean repeatedSubstringPattern(String s) {
         String doubled = s + s;
        String middle = doubled.substring(1, doubled.length() - 1);
        if(middle.contains(s)){
            return true;
        }
        return false;
        
        
        
    }
}