class Solution {
    public int minimumSum(int n, int k){
        int [] arr = new int[1000];
        int a = 1;
        for(int i = 0; i<arr.length; i++){
            arr[i] = a;
            a++;
        }
        int total = 0;
        int c  = 0;
        for(int i = 0; i<arr.length && c<n; i++){
            boolean found = true;
            for(int j = 0; j<i; j++){
                if(arr[i] + arr[j] == k){
                    found = false;
                    break;
                }
            }
            if(found){
                total += arr[i];
                c++;
            }
        }
        return total;
        
    }
}