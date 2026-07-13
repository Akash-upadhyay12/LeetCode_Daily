class Solution {
    public int[] countBits(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            int k = i;
            int count = 0;
            while(k>0){
                if(k%2 != 0){
                    count++;
                }
                k /=2;
            }
            list.add(count);
        }
        int[] arr = new int[list.size()+1];
        int i = 1;
        for(int x : list){
            arr[i] = x;
            i++;
        }
        //  int left = 0;
        // int right = arr.length - 1;
        // while (left <right) {
        //     int temp = arr[left];
        //    arr[left] = arr[right];
        //    arr[right] = temp;
        //     left++;
        //     right--;
        // }
        return arr;
        
    }
}