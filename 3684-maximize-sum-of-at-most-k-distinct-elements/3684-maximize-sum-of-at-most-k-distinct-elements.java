class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int i = list.size()-1;
        ArrayList<Integer> list2 = new ArrayList<>();
        while(k>0 && i>=0){
            list2.add(list.get(i));
            i--;
            k--;
        }
        int [] arr = new int[list2.size()];
        int j = 0;
        for(int x : list2){
            arr[j] = x;
            j++;
        }
        System.out.println(list2);
        return arr;
    }
}