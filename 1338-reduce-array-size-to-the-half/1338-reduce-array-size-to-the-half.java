class Solution {
    public int minSetSize(int[] arr) {
        if(arr.length == 2){
            return 1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        int n = arr.length/2;
        int x = arr.length;
        int count = 0;
        for(int i = 0; i<list.size(); i++){
            if(x > n){
                x -= list.get(i);
                count++;
            }

        }
        return count;
    }
}