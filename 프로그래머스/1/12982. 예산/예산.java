class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        //배열 정렬부터 하기
        for(int i=0; i<d.length-1; i++){
            for(int j=i+1; j<d.length; j++){
                if(d[i] > d[j]){
                    int temp = d[i];
                    d[i] = d[j];
                    d[j] = temp;
                }
            }
        }
        
        //처음부터 순회하면서 개수 세기
        for(int i=0; i<d.length; i++){
            budget -= d[i];
            if(budget >= 0) answer++;
            else break;
        }
        return answer;
    }
}