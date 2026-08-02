class Solution {
    public int balancedStringSplit(String s) {
        int count =0;
        int temp =0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'R'){
                temp++;
            }
            else{
                temp--;
            }
            if(temp==0){
                count++;
            }
        }
        return count;
        
    }
}