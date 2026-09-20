class Solution {
    public char findKthBit(int n, int k){
        StringBuilder sb = new StringBuilder();
        sb.append("0");
        for(int i = 1; i<n; i++){
            sb.append("1");
            for(int j = sb.length()-2; j>=0; j--){
                if(sb.charAt(j) == '1'){
                    sb.append("0");
                }
                else{
                    sb.append("1");
                }
            }
        }
        return sb.charAt(k-1);
        
    }
}