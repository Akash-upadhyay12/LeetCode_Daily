class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int s = 0;
        Arrays.sort(costs);
        for(int i = 0; i<costs.length; i++){
            if(costs[i] > coins){
                return 0;
            }
            s+=costs[i];
            if(s==coins){
                return i+1;
            }
            else if(s>coins){
                return i;
            }
            

           
        }
        return costs.length;
        
        
    }
}