class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int x : apple){
            sum += x;
        }
        Arrays.sort(capacity);
        int sum2 = 0;
        int c = 1;
        for(int i = capacity.length-1; i>=0; i--){
            int x = capacity[i];
            sum2 += x;
            if(sum2>=sum){
                return c;
            }
            c++;
        }
        return -1;

        
        
    }
}