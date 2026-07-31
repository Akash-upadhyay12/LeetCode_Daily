class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left; i<=right; i++){
            if(i<2){
                continue;
            }
            int j;
            for(j = 2; j*j <= i; j++){
                if(i%j == 0) {
                    break;
                }
            }
            if(j*j>i){
                list.add(i);
            }
        }
        int [] arr = new int[2];
        Arrays.fill(arr, -1);
        if(list.size()<2){
            return arr;
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1; i<list.size(); i++){
            int ans = list.get(i)-list.get(i-1);
            if(ans<min){
                arr[0]= list.get(i-1);
                arr[1]= list.get(i);
                min = Math.min(min, ans);
            }
        }
        return arr;
    }
}
