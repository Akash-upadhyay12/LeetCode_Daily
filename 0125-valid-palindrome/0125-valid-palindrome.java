class Solution {
    static boolean check(String s, int i , int j){
        if(i>=j){
            return true;
        }
        if(!Character.isLetterOrDigit(s.charAt(i))){
            return check(s, i+1, j);
        }
        if(!Character.isLetterOrDigit(s.charAt(j))){
            return check(s, i, j-1);
        }
        if(s.charAt(i)== s.charAt(j)){
        return check(s, i+1, j-1);
        }

        return false;


    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        return check(s, 0, s.length()-1);

        
    }
}