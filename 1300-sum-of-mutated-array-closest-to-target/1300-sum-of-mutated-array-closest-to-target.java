class Solution {
    public int findBestValue(int[] arr, int target) {
        int max = Integer.MIN_VALUE;
        for(int x : arr){
            max = Math.max(max, x);
        }
        int x = 1;
        boolean found = false;
        long min = Long.MAX_VALUE;
        int a = 0;
        while(x <= max && found == false){
            long sum = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] <= x){
                    sum += arr[i];
                }
                else{
                    sum += x;
                }
            }
            if(sum <= target){
                min = sum;
                a = x;
                x++;
            }
            else{
                if(a == 0){
                    return x-1;
                }
                long ans1 = Math.abs(min - target);
                long ans2 = Math.abs(sum - target);
                if(ans1 <= ans2){
                    found = true;
                    return a;
                }
                else{
                    found = true;
                    return x;
                }
            }
        }
        return max;
    }
}