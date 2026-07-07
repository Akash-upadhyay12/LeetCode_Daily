class Solution {
    public void rotate(int[] arr, int k) {
        k = k% arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);



        
    }
    public static void reverse(int [] arr, int i, int j){
        if(i>=j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(arr, i+1, j-1);
    }
}