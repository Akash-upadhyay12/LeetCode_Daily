class Solution {
    public boolean judgeCircle(String s) {
        int c1 = 0;
        int c2 = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'L'){
                c1++;
            }
            else if(s.charAt(i) == 'R'){
                c1--;
            }
            else if(s.charAt(i) == 'U'){
                c2++;
            }
            else{
                c2--;
            }
        }
        if(c1 == 0 && c2 == 0){
            return true;
        }
        return false;
        
    }
}