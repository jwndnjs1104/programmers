class Solution {
    public int solution(int balls, int share) {
        double answer = 1;
        if(share == balls) return (int)answer;
        else if((balls/2)<share) share = balls-share;
        
        for(int i=balls; i>balls-share; i--){
            answer = answer * i;
        }
        
        for(int i=share; i>0; i--){
            answer = answer / i;
        }
        
        return (int)answer;
    }
}
