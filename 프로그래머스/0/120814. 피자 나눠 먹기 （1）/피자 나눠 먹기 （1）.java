class Solution {
    public int solution(int n) {
        //피자 7조각
        //n명이 적어도 1조각씩 먹기위해 필요한 피자수 구하기
        
        int answer = n%7==0?n/7:n/7+1;
        return answer;
    }
}