class Solution {
    public int solution(int[] sides) {
        int Max = 0;
        int sum = 0;
        for(int side:sides){
            if(Max<side){
                sum+=Max;
                Max = side;
            }
            else sum+=side;
        }
         
        return Max<sum?1:2;
    }
}