class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums){
        ArrayList<Boolean> list = new ArrayList<>();
        int deci = 0;
        for(int x : nums){
            deci = (2 * deci) + x; 
            if(deci % 5 == 0){
                list.add(true);
            }
            else{
                list.add(false);
            }
            deci %= 5;
        }
        return list;

        
    }
}