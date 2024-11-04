class Solution {
    public int solution(int hp) {
        //장군 5
        //병정 3
        //일 1
        int answer = hp/5 + (hp%5)/3 + (hp%5)%3;
        return answer;
    }
}