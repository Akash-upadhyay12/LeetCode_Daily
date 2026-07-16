class Solution {
    public boolean squareIsWhite(String s) {
        for(int i = 0; i<s.length()-1; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'c' || ch == 'e' || ch == 'g'){
                if(Integer.parseInt(String.valueOf(s.charAt(i+1))) % 2 == 0){
                    return true;
                }
                else{
                    return false;
                }
            }
            else if(ch == 'b' || ch == 'd' || ch == 'f' || ch == 'h'){
                if(Integer.parseInt(String.valueOf(s.charAt(i+1))) % 2 == 0){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        return false;
        
    }
}