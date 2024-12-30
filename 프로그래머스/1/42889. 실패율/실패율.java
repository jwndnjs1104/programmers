class Solution {
    public int[] solution(int N, int[] stages) {
        //stages는 각 유저별 머물러있는 스테이지 배열
        //스테이지 순서대로 실패율구해서
        //새 배열에서 나열하기?
        double[] failureRate = new double[N]; 
        int[] stageNumber = new int[N];
        for(int i=0; i<N; i++){ 
            stageNumber[i] = i+1;
            int total = 0;
            int fails = 0;
            for(int j=0; j<stages.length; j++){//states 배열 반복해서 각 스테이지별 실패율 구하기
                if(stages[j] >= i+1){
                    total++;
                    if(stages[j]==i+1) fails++;
                }
            }
            if(total == 0 || (total!=0 && fails==0)) failureRate[i] = 0;
            else failureRate[i] = (double)fails/total;
        }
        
        for(int i=0; i<failureRate.length-1; i++){
            for(int j=i+1; j<failureRate.length; j++){
                if(failureRate[i]<failureRate[j]){
                    double temp = failureRate[i];
                    failureRate[i] = failureRate[j];
                    failureRate[j] = temp;
                    int temp2 = stageNumber[i];
                    stageNumber[i] = stageNumber[j];
                    stageNumber[j] = temp2;
                }
                else if(failureRate[i]==failureRate[j] && stageNumber[i] > stageNumber[j]){
                    int temp2 = stageNumber[i];
                    stageNumber[i] = stageNumber[j];
                    stageNumber[j] = temp2;
                }
            }
        }
        
        return stageNumber;
    }
}