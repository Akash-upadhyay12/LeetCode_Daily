class Solution {
    public String winningPlayer(int x, int y) {
        boolean turn = true;
        while( x>0 && y>0){
            if(x>=1 && y > 3){
                if(turn == true){
                x -=1;
                y -= 4;
                turn = false;
            }
            else if(turn == false){
                x -= 1;
                y -= 4;
                turn = true;
            }
        }
        else{
            break;
        }

        }
        if(turn == true){
            return "Bob";
        }
        else{
            return "Alice";
        }

        
    }
}