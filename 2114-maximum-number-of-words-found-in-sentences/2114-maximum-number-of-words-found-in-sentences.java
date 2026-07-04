class Solution {
    public int mostWordsFound(String[] s) {
        int max = 0;

        for(String w : s){
            int count = 0;
            String [] word = w.split(" ");

            for(int i = 0; i<word.length; i++){
                count++;
            }
            max = Math.max(max, count);

            
        }
        return max;

        
    }
}