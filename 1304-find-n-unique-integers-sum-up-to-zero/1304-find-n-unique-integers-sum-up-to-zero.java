class Solution {
    public int[] sumZero(int n) {
        int [] arr = new int[n];
        if(arr.length % 2 == 0){
            int j = -1;
            for(int i = 0; i<arr.length/2; i++){
                arr[i] = j;
                j--;
            }
            int k = 1;
            for(int i = arr.length/2; i<arr.length; i++){
                arr[i] = k;
                k++;
            }

        }
        else{
            int j = -1;
            for(int i = 0; i<arr.length/2; i++){
                arr[i] = j;
                j--;
            }
            int k = 1;
            for(int i = arr.length/2+1; i<arr.length; i++){
                arr[i] = k;
                k++;
            }

        }
        return arr;
        
    }
}