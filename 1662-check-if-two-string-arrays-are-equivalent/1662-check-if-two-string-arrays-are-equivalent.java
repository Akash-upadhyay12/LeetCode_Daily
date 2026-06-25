class Solution {
    public boolean arrayStringsAreEqual(String[] s1, String[] s2) {
        String s = String.join("", s1); 
        String p = String.join("",s2);
        s = s + s;
        p = p + p;

        if(s.equals(p)){
            return true;
        }
        else{
            return false;
        }
        
    }
}