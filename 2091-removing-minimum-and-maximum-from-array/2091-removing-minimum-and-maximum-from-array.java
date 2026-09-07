class Solution {
    public int minimumDeletions(int[] arr) {
        if(arr.length == 1){
            return 1;
        }
        int min = Integer.MAX_VALUE;
        int idx1 = 0;
        int idx2 = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
                idx1 = i;
            }
            if(arr[i]>max){
                max = arr[i];
                idx2 = i;
            }
        }
        int ans1 = Math.max(idx1, idx2) + 1;
        int ans2 = arr.length - Math.min(idx1, idx2);
        int ans3 = (idx1 + 1) + (arr.length-idx2);
        int ans4 = (idx2 + 1) + (arr.length-idx1);
        return Math.min(ans1, Math.min(ans2, Math.min(ans3, ans4)));
        
    }
}