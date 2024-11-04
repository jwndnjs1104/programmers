class Solution {
    public int[] solution(int n) {
        int num=0;
        for(int i=1; i<=n; i++){
            if(n%i==0) num+=1;
        }
        
        int[] answer = new int[num];
        int index = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0) {
                answer[index] = i;
                index++;
            }
        }
        
        return answer;
    }
}