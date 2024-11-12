class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int num = i; num<=j; num++){
            int temp = num;
            while(true){
                if(temp%10==k) answer++;
                
                if(temp/10==0) break;
                else temp/=10;
            }
        }
        return answer;
    }
}