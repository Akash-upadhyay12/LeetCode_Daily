class Solution {
    public int minOperations(List<Integer> list, int k) {
        int [] arr = new int[k];
        int w = 0;
        for(int i = 1; i<=k; i++){
            arr[w] = i;
            w++;
        }
        int j = k;
        for(int i= list.size()-1; i>=0; i--){
            if(list.get(i) <= k){
                if(arr[list.get(i)-1] !=0){
                    arr[list.get(i)-1] = 0;
                    j--;
                }

            }
            else{
                continue;
            }

            if(j == 0){
                return list.size()-i;
            }
        }
        return -1;

        
    }
}