class Solution {
    public long countCommas(long n) {
        if (n <= 999) {
            return 0;
        }
        long a = 1000L;
        long b = 1000000L;
        long c = 1000000000L;
        long d = 1000000000000L;
        long e = 1000000000000000L;
        if (n < b) {
            return n - 999;
        }
        else if (n < c) {
            return (n - 999) * 2 - 999000L;
        }
        else if (n < d) {
            return (n - 999) * 3 - 1000998000L;
        }
        else if (n < e) {
            return (n - 999) * 4 - 1001000997000L;
        }
        else {
            return (n - 999) * 5 - 1001001000996000L;
        }
    }
}