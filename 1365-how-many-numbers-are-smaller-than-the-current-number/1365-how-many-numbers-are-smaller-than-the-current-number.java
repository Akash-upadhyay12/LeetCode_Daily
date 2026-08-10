import java.util.Arrays;

class Solution { 
    public int[] smallerNumbersThanCurrent(int[] nums) { 
        int [] orig = new int[nums.length]; 
        int z = 0; 
        for(int x : nums){ 
            orig[z] = x; 
            z++; 
        } 
        
        int [] count = new int[nums.length]; 
        count[0] = 0; 
        Arrays.sort(nums); 
        
        int [] fans = new int[orig.length]; 
        boolean [] check = new boolean[orig.length]; 
        Arrays.fill(check, true); 
        for(int i = 1; i < nums.length; i++){ 
            if(nums[i] > nums[i-1]){ 
                count[i] = i; 
            } else {
                count[i] = count[i-1]; 
            }
        } 
        
        for(int i = nums.length-1; i >= 0; i--){ 
            boolean found = false; 
            int j = 0; 
            while(found == false){ 
                if(nums[i] == orig[j]){ 
                    if(check[j] == true){ 
                        fans[j] = count[i]; 
                        check[j] = false; 
                        found = true; 
                    } 
                } 
                j++;
            } 
        } 
        return fans; 
    } 
}
