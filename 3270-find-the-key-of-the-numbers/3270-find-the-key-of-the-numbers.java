class Solution {
    public int generateKey(int n1, int n2, int n3) {
        int c = 0;
        int ans = 0;
        while(n1>0 || n2>0 || n3>0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            int d3 = n3 % 10;
            int min = Math.min(d1, Math.min(d2, d3));
            ans += min*(int)Math.pow(10, c);
            n1 /= 10;
            n2 /= 10;
            n3 /= 10;
            c++;
        }

        return ans;


    }
}