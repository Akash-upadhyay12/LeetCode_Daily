class Solution {
    public int minNumberOfHours(int ie, int iex, int[] ene, int[] exp){
        int te = 0;
        for(int x : ene){
            te += x;
        }
        int sum = te + 1;
        int hours = sum - ie;
        if(hours < 0) {
            hours = 0;
        }
        for(int i =  0; i < exp.length; i++){
            if(iex > exp[i]){
                iex += exp[i];
            }  
            else{
                int ans = exp[i] - iex + 1;
                hours += ans;
                iex += ans;
                iex += exp[i];
            }
        }
        
        return hours;
    }
}
