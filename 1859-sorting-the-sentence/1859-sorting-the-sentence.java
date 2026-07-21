class Solution {
    public String sortSentence(String s) {
        String [] arr = s.split(" ");
        String [] ans = new String[arr.length];
        for(int i =0; i<arr.length; i++){
            String a = arr[i];
            ans[a.charAt(a.length()-1) - '1'] = a.substring(0, a.length() - 1);;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<ans.length; i++){
            sb.append(ans[i] + " ");
        }
        System.out.println(Arrays.toString(ans));
        return sb.toString().trim();

        
    }
}