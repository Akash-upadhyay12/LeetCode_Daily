class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n>0){
            int digit = n % 10;
            list.add(digit);
            n /= 10;
        }
        int [] arr = new int[list.size()];
        int i =0;
        for(int x : list){
            arr[i] = x;
            i++;
        }
        Arrays.sort(arr);
        return arr[arr.length-1]*arr[arr.length-2];
        
    }
}