class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int a = 1;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            int ans  = Math.abs(ch - 'z') + 1;
            sum += ans * a;
            a++;

        }
        return sum;
        
    }
}