class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int x : chalk){
            sum += x;
        }

        long ans = (long)k % sum;

        if(ans == 0){
            return 0;
        }

        for(int i = 0; i < chalk.length; i++){
            if(chalk[i] <= ans){
                ans -= chalk[i];
            }
            else{
                return i;
            }
        }

        return chalk.length;
    }
}