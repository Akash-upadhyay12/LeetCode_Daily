class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int [] arr = new int[2];
        int count1 = 0;
        int count2 = 0;
        int i =0;
        int j =0;
        // for answer 1;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                count1++;
                i++;
            }
            else if(nums1[i] != nums2[j]){
                if(nums1[i]<nums2[j]){
                    i++;
                }
                else{
                    j++;
                }
            }
        }
            arr[0] = count1;

            int k =0;
            int l =0;

            // for answer 2;
            while(k<nums2.length && l<nums1.length){
                if(nums2[k] == nums1[l]){
                    count2++;
                    k++;
                }

                else if(nums2[k] != nums1[l]){
                    if(nums2[k]<nums1[l]){
                        k++;
                    }
                    else{
                        l++;
                    }
                }
            }
            arr[1] = count2;
            return arr;

        
        
    }
}