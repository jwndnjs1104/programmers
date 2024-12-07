class Solution {
    public int solution(int num) {
        int answer = 0;
        long number = num;
        
        while(true){
            if(number==1) return answer;
            else if(answer==500) return -1;
            
            if(number%2==0) number/=2;
            else number=(number*3)+1;
            
            answer++;
        }
    }
}