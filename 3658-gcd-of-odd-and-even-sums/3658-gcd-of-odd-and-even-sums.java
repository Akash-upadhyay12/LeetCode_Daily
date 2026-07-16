class Solution {
    public int gcdOfOddEvenSums(int n) {
        int OddSum = 0;
        int EvenSum = 0;
        for(int i = 1; i<=n; i++){
            OddSum += i*2 -1;
            EvenSum += i*2;
        }
        
        while(EvenSum != 0){
            int temp = OddSum % EvenSum;
            OddSum = EvenSum;
            EvenSum = temp;
        }
        return OddSum;
 
        
    }
}