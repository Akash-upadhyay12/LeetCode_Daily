class Solution {
    public int pivotInteger(int n) {
        int ls = 0;
        int rs = 0;
        int ts = n*(n+1)/2;
        for(int i = 1; i<=n; i++){
            rs = ts - (ls + i);
            if(rs == ls){
                return i;
            }
            
            ls += i;
        }
        return -1;
        
    }
}