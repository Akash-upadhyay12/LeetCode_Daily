class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : friends){
            map.put(x, 0);
        }
        int [] arr = new int[friends.length];
        int i = 0;
        for(int x : order){
            if(map.containsKey(x)){
                arr[i] = x;
                i++;
            }
        }
        return arr;
    }
}