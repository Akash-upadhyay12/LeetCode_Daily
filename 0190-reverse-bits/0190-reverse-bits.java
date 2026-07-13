class Solution {
    public int reverseBits(int n) {
        ArrayList<Integer> list = new  ArrayList<>();
        while(n>0){
            int digit = n % 2;
            list.add(digit);
            n /=2;
        }
        //Collections.reverse(list);
        int [] arr = new int [32];
       // Arrays.fill(arr, 0);
        int i = 0;
        for(int  x : list){
            arr[i] = x;
            i++;
        }
        int j = 0;
        int k = arr.length-1;
        while(j<=k){
            int temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
            j++;
            k--;
        }
        int sum = 0;
        int p = 1;
        for(int m = 0; m<arr.length; m++){
            sum += p * arr[m];
             p *= 2; 
        }
        return sum;
        
   
    }
}