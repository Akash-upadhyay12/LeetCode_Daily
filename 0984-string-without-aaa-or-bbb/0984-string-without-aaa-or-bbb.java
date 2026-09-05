class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int ans = a + b;
        int counta = 0;
        int countb = 0;
        while(ans > 0){
            if(a>=b){
                if(a>0){
                    if(counta<=1){
                        sb.append("a");
                        a--;
                        counta++;
                        countb = 0;
                        ans--;
                    }
                    else{
                        if(b>0){
                        sb.append("b");
                        b--;
                        countb++;
                        counta = 0;
                        ans--;
                        }
                    }
                }
                else if(b>0){
                    sb.append("b");
                    countb++;
                    b--;
                    ans--;
                    counta = 0;
                }
            }
            else{
                if(b>0){
                    if(countb<=1){
                        sb.append("b");
                        b--;
                        countb++;
                        counta = 0;
                        ans--;
                    }
                    else{
                        if(a>0){
                            sb.append("a");
                            a--;
                            counta++;
                            countb = 0;
                            ans--;
                        }
                        
                    }
                }
            }

        }
        return sb.toString();
        
    }
}