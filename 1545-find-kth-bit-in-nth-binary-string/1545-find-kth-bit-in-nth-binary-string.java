class Solution {
    public char findKthBit(int n, int k){
        StringBuilder sb = new StringBuilder();
        //int c = 0;
        //boolean cur = true;
        sb.append("0");
        for(int i = 1; i<=n; i++){
            sb.append("1");
            int j = sb.length()-2;
            while(j>=0){
                char ch = sb.charAt(j);
                if(ch == '1'){
                    sb.append("0");
                }
                else{
                    sb.append("1");
                }
                j--;
            }
        }
        return sb.charAt(k-1);
    }
}