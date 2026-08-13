class Solution {
    public long gcdSum(int[] nums) {
        int max = 0;
        int[] arr = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                arr[i] = nums[i];
                max = nums[i];
            } 
            else {
                arr[i] = max; 
            }
        }

        int[] ans = new int[nums.length];
        int i = 0, j = 0, k = 0;
        while (i < nums.length && j < arr.length) {
            int a = nums[i];
            int b = arr[j];
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            ans[k] = a;
            i++; j++; k++;
        }
        
        Arrays.sort(ans);
        
        int x = 0;
        int y = ans.length - 1;
        long sum2 = 0;
        while (x < y) {
            long a = ans[x];
            long b = ans[y]; 

            while (b != 0) {
                long temp = b;
                b = a % b;
                a = temp;
            }
            sum2 += a; 
            x++;
            y--;
        }

        return sum2;
    }
}
