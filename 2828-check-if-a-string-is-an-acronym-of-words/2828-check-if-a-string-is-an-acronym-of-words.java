class Solution {
    public boolean isAcronym(List<String> arr, String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<arr.size(); i++){
            char [] nums = arr.get(i).toCharArray();
            sb.append(nums[0]);
        }
        if(s.equals(sb.toString())){
            return true;
        }
        return false;


        
    }
}