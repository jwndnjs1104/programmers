class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){ 
            int factorial = 1;
            for(int j=1; j<=i; j++){ //팩토리얼 만들기
                factorial *=j;
            }
            if(factorial <= n) {
                answer = i;
            }
            else break;
        }
        
        return answer;
    }
}