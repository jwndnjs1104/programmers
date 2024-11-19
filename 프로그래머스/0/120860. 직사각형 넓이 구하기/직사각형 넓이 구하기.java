class Solution {
    public int solution(int[][] dots) {
        int answer = 1;
        for(int i=1; i<dots.length; i++){
            if(dots[0][0]==dots[i][0])
                answer *= dots[i][1]>dots[0][1]?dots[i][1]-dots[0][1]:dots[0][1]-dots[i][1];
            
            else if(dots[0][1]==dots[i][1])
                answer *= dots[i][0]>dots[0][0]?dots[i][0]-dots[0][0]:dots[0][0]-dots[i][0];
        }
        return answer;
    }
}