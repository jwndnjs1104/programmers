class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(true){
            if(n/a==0) break;
            else{
                answer += (n/a)*b;
                n = n%a + (n/a)*b;
            }
        }
        return answer;
    }
}