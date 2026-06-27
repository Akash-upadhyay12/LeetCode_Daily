class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> AnsSet = new HashSet<>();


        for(int i = 0; i<nums1.length;  i++){
                set1.add(nums1[i]);
            
        }
        for(int i = 0; i<nums2.length;  i++){
                set2.add(nums2[i]);
        }
        
        for(int co : set1){
            if(set2.contains(co)){
                AnsSet.add(co);
            }
        }
        
        int [] ans = new int[AnsSet.size()];
        int i = 0;
        for(int a : AnsSet){
            ans[i] = a;
            i++;
        }
        return ans;


        
    }
}