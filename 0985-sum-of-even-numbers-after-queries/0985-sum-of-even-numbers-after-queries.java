class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] mat) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<mat.length; i++){
            nums[mat[i][1]] += mat[i][0];
            int sum = 0;
            for(int j = 0; j<nums.length; j++){
                if(nums[j] % 2 == 0){
                    sum += nums[j];

                }
            }
            list.add(sum);
        }
        int [] arr = new int[list.size()];
        int k = 0;
        for(int x : list){
            arr[k] = x;
            k++;
        }
        System.out.println(list);
        return arr;

       

        
    }
}