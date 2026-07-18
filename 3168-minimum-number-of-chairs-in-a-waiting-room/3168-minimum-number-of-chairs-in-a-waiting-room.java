class Solution {
    public int minimumChairs(String s) {
        int c= 0;
        int max = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == 'E'){
                c++;
            }
            else if(s.charAt(i) == 'L'){
                c--;
            }
            max = Math.max(max,c);
        }
        return max;
        
    }
}