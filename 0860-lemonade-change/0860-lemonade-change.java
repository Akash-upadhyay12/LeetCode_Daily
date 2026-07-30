class Solution {
    public boolean lemonadeChange(int[]  nums) {
        int p = 0;
        int d = 0;
        int b = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 5){
                p += 1;
            }
            else if(nums[i] == 10){
                if(p>=1){
                    p -=1;
                    d +=1;
                }
                else{
                    return false;
                }
            }
            else if(nums[i] == 20){
                if(p>=1 && d>=1){
                    p-=1;
                    d-=1;
                    b+=1;
                }
                else if(p>=3 && d==0){
                    p -= 3;
                    b +=1;

                }
                else{
                    return false;
                }
            }
            
            
        }
        return true;
        
    }
}