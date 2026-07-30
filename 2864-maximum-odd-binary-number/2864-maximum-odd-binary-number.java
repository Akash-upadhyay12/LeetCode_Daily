class Solution { 
    public String maximumOddBinaryNumber(String w) { 
        char [] s = w.toCharArray(); 
        int [] nums = new int[s.length]; 
        int count = 0; 
        int k = nums.length - 2; 
        int j = 0; 

        for(int i = s.length-1; i>=0; i--){ 
            if(count == 0){ 
                if(s[i] == '1'){
                    nums[nums.length - 1] = Integer.parseInt(String.valueOf(s[i])); 
                    count++; 
                } 
                else{ 
                    nums[k] = Integer.parseInt(String.valueOf(s[i])); 
                    k--; 
                } 
            } 
            else if(count == 1){ 
                if(s[i] == '0'){ 
                    nums[k] = Integer.parseInt(String.valueOf(s[i])); 
                    k--; 
                } 
                else if(s[i] == '1'){ 
                    nums[j] = Integer.parseInt(String.valueOf(s[i])); 
                    j++; 
                } 
            } 
        } 

        StringBuilder sb = new StringBuilder(); 
        for (int num : nums) {
            sb.append(num);
        }
        
        System.out.println(Arrays.toString(nums)); 
        return sb.toString(); 
    } 
}
