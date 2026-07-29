class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer> list =new ArrayList<>();
        int k = 0;
        while(n>0){
            int digit = n % 10;
            if(digit != 0){
                int ans = digit * (int)Math.pow(10,k);
                list.add(ans);
            }
            k++;
            n /= 10;
        }
        System.out.println(list);
        int i = 0;
        int [] ans = new int[list.size()];
        for(int j = list.size()-1; j>=0; j--){
            ans[i]= list.get(j);
            i++;
        }
        return ans;
        
    }
}