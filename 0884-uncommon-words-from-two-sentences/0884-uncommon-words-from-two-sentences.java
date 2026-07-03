class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for(int i = 0; i<arr1.length; i++){
            map1.put(arr1[i], map1.getOrDefault(arr1[i], 0) +1);
        }
        for(int i = 0; i<arr2.length; i++){
            map2.put(arr2[i], map2.getOrDefault(arr2[i], 0) +1);
        }
        ArrayList<String> list = new ArrayList<>();
        for(String c : map1.keySet()){
            if(map1.get(c) == 1 && !map2.containsKey(c)){
                list.add(c);
            }
        }
        for(String c : map2.keySet()){
            if(map2.get(c) == 1 && !map1.containsKey(c)){
                list.add(c);
            }
        }
        int i = 0;
        String [] arr = new String[list.size()];
        for(String  c : list){
            arr[i] = c;
            i++;
        }
        return arr;

        

        
        
    }
}