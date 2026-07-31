class Solution {
    public int furthestDistanceFromOrigin(String s) {
        int l = 0;
        int r = 0;
        int p = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'L'){
                l++;
            }
            else if(s.charAt(i) == 'R'){
                r++;
            }
            else{
                p++;
            }
        }
        int ans = Math.abs(l-r);
        return ans + p;
        
    }
}