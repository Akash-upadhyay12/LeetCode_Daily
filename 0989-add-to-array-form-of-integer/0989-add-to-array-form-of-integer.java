class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int j = nums.length-1;
        int car = 0;
        while(k>0 && j>=0){
            int digit = k % 10;
            int sum = digit + nums[j] + car;
            if(sum <=9){
                list.add(sum);
                car = 0;
            }
            else{
                int ans = sum % 10;
                list.add(ans);
                car = sum / 10;
            }
            j--;
            k /= 10;
        }
        while(j>=0){
            int ans = nums[j] + car;
            if(ans<=9){
                list.add(ans);
                car = 0;
            }
            else{
                list.add(ans % 10);
                car  = ans / 10;
            }
            
            j--;
        }
        while(k>0){
            int digit = k % 10;
             int ans = digit + car;
             if(ans <= 9){
                list.add(ans);
                car = 0;
             }
             else{
                list.add(ans%10);
                car = ans / 10;
             }
             
            k /= 10;
        }
        if(car>0){
            list.add(car);
        }
        Collections.reverse(list);
        return list;
       
        
        
        
        
        
    }
}