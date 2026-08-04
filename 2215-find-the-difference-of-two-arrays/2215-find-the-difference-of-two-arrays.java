class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ForRight = new ArrayList<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0; i<nums2.length; i++){
            set2.add(nums2[i]);
        }
        for(int i = 0; i<nums1.length; i++){
            if(!set2.contains(nums1[i])){
                if(!map1.containsKey(nums1[i])){
                    ForRight.add(nums1[i]);
                }
                map1.put(nums1[i], i);
                
            }
            
        }
        ans.add(ForRight);

        ArrayList<Integer> forleft = new ArrayList<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        HashSet<Integer> set1 = new HashSet<>();
        for(int i = 0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i = 0; i<nums2.length; i++){
            if(!set1.contains(nums2[i])){
                if(!map2.containsKey(nums2[i])){
                    forleft.add(nums2[i]);
                }
                map2.put(nums2[i], i);
                
            }
        }
        ans.add(forleft);

        return ans;

        
    }
}