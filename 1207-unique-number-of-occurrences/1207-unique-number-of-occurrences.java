class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int ar : arr){
          map.put(ar, map.getOrDefault(ar, 0)+1);

        }
        HashSet<Integer> set = new HashSet<>();
        for(int arrr : map.values()){
            set.add(arrr);

        }
        if(map.size() == set.size()){
                return true;
            }
            else{
        return false;
            }


        
    }
}