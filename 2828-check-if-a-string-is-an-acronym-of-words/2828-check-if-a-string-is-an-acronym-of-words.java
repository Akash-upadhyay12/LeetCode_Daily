class Solution {
    public boolean isAcronym(List<String> arr, String s){
        if(arr.size() != s.length()){
            return false;
        }
        for(int i = 0; i<arr.size(); i++){
            if(arr.get(i).charAt(0) != s.charAt(i)){
                return false;
            }
        }
        return true;


        
    }
}