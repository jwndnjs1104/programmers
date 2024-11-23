class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int distance = 10000;
        for(int num:array){
            int dist = num>n?num-n:n-num;
            if(distance>dist) {
                answer = num;
                distance = dist;
            }
            else if(distance == dist){
                if(answer > num) answer = num;
            }
        }
        return answer;
    }
}