class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int pc = 0;
        int lc= 0;
        int gc = 0;
        for(int x : nums){
            if(x>pivot){
                gc++;
            }
            else if(x==pivot){
                pc++;
            }
            else{
                lc++;
            }
        }
        int [] arr = new int[nums.length];
        int i = 0;
        int j = lc;
        int k = lc + pc;
        for(int x : nums){
            if(x>pivot){
                arr[k] = x;
                k++;
            }
            else if(x== pivot){
                arr[j] = x;
                j++;
            }
            else{
                arr[i] = x;
                i++;
            }
        }
        return arr;

        
        
    }
}