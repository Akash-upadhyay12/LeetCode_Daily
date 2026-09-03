class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            int val = ch - 'a' + 1;
            while(val > 0){
                sum += val % 10;
                val /= 10;
            }
        }
        if(k == 1){
            return sum;
        }
        int temp = sum;
        int ans = 0;
        while(k>1){
            int fans = 0;
            while(temp > 0){
                fans += temp % 10;
                temp /= 10;
            }
            temp=fans;
            ans = fans;
            k--;
            

        }
    return ans;
        
        
    }
}