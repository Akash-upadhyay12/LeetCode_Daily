/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i = 0;
        int j = n;
        int  min = Integer.MAX_VALUE;
        while(i<=j){
            int mid = i + (j - i)/2;
            if(isBadVersion(mid) == true){
                j = mid -1;
                min = Math.min(min, mid);
            }
            else{
                i = mid + 1;
            }
        }
        return min;
       
        
    }
}