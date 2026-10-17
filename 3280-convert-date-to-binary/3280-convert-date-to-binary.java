class Solution {
    public String convertDateToBinary(String s) {
        StringBuilder temp = new StringBuilder();
        String [] arr = s.split("-");
        int c = 0;
        for(int i = 0; i<arr.length; i++){
            StringBuilder sb = new StringBuilder();
            int a = Integer.parseInt(String.valueOf(arr[i]));
            while(a > 0){
                int b = a % 2;
                sb.append(b);
                a /=  2;
            }
            sb.reverse();
            if(c < 2){
                sb.append("-");
                c++;
            }

            temp.append(sb.toString());

        }
        return temp.toString();
        
    }
}