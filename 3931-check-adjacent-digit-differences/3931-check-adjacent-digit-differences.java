class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s){
        for(int i = 0; i<s.length()-1; i++){
            int a = Integer.parseInt(String.valueOf(s.charAt(i)));
            int b = Integer.parseInt(String.valueOf(s.charAt(i+1)));
            if(Math.abs(b - a) > 2){
                return false;
            }
        }
        return true;
        
    }
}