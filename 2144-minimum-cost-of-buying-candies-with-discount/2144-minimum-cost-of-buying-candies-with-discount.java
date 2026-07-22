class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length==2){
            return cost[0]+ cost[1];
        }
        if(cost.length==1){
            return cost[0];
        }
        Arrays.sort(cost);
        int i = 0;
        int j  = cost.length-1;
        while(i<=j){
            int temp = cost[i];
            cost[i] = cost[j];
            cost[j] = temp;
            i++;
            j--;
        }
        // int sum = 0;
          System.out.println(Arrays.toString(cost));
        //  int p = 0;

        //  for(int k = 0; k<cost.length; k+=3){
        //     if(k+1<cost.length){
        //     sum += cost[k] + cost[k+1];
        //     }
        //  }
        //  if(cost.length%2 == 0){
        //     return sum + cost[cost.length-1];
        //  }
        //  return sum;
        int sum =0;
        for(int k = 0; k<cost.length;k++){
            sum += cost[k];
        }
        for(int l = 2; l<cost.length; l+=3){
            sum -=cost[l];
        }
        
        return sum;
        



    }
}