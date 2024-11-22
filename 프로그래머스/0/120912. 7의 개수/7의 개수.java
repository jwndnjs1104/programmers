class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int num:array){
            while(true){
                if(num%10==7) answer++;
                if(num/10!=0) num/=10;
                else break;
            }
        }
        return answer;
    }
}