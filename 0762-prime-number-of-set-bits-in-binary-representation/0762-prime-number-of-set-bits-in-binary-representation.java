class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left; i <= right; i++) {
            int sum = 0;
            int x = i;
            while(x > 0) {
                if(x % 2 != 0) {
                    sum += 1;
                }
                x /= 2;
            }
            boolean found = false;
            if(sum >= 2) {
                if(found == false) {
                    for(int j = 2; j * j <= sum; j++) {
                        if(sum % j == 0) {
                            found = true;
                            break;
                        }
                    }
                }

                if(found == false) {
                    count++;
                }
            }
        }
        return count;
    }
}