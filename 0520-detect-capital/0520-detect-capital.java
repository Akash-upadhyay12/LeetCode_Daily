class Solution {
    public boolean detectCapitalUse(String s) {
        int c= 0;
        for(int i = 0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                c++;

            }
        }
        if(c==s.length()){
            return true;
            
        }
        else if(c == 1 && Character.isUpperCase(s.charAt(0))){
            return true;
        }
        else if(c == 0 && s.length()-c == s.length()){
            return true;
        }
        else{
            return false;
        }
        
    }
}