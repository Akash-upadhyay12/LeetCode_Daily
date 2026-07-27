class Solution {
    public int bitwiseComplement(int n) {
        if(n<=0){
            return 1;
        }
        ArrayList<Integer> list = new  ArrayList<>();
        while(n>0){
            int digit = n % 2;
            list.add(digit);
            n /= 2;
        }
        int ans = 0;
        int k   = 0;
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) == 1){
            ans += 0*Math.pow(2,k);
            }
            else{
                ans += 1*Math.pow(2,k);
            }
            k++;

        }
        return ans;
        
    }
}