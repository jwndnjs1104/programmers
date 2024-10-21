class Solution {
    public int solution(int n, int k) {
        //12000   2000, 10인분에 음료수 하나 서비스
        
        int answer = n*12000 + (k-n/10)*2000;
        return answer;
    }
}