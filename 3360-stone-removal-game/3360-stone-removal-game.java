class Solution {
    public boolean canAliceWin(int n){
        if(n<10){
            return false;
        }
        int req = 10;
        boolean alice = true;
        boolean bob = true;
        while(n >= req){
            if(alice){
                n -= req;
                req -=1;
                alice = false;
                bob = true;
            }
            else if(bob){
                n -= req;
                req -=1;
                bob = false;
                alice = true;
            }
        }
        if(!alice){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}