class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            int higherScores = 0;
            int equalScores = 0;
            for(int j=0; j<score.length; j++){
                if(score[i][0]+score[i][1]<score[j][0]+score[j][1]) higherScores++;
                else if(score[i][0]+score[i][1]==score[j][0]+score[j][1]) equalScores++;
            }
            if(equalScores!=0) answer[i]=higherScores+1;
            else answer[i]=higherScores;
        }
        
        return answer;  
    }
}