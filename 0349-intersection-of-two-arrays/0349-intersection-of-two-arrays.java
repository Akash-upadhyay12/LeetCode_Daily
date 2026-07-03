class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int x : nums1){
            set1.add(x);
        }
        for(int x : nums2){
            set2.add(x);
        }
        ArrayList<Integer> list = new ArrayList<>();

        for(int x : set1){
            if(set2.contains(x)){
                list.add(x);

            }
        }
        int [] arr = new int[list.size()];

        int i = 0;
        for(int x : list){
            arr[i] = x;
            i++;
        }
        return arr;


        

        
    }
}