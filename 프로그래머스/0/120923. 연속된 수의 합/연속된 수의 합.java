class Solution {
    public int[] solution(int num, int total) {
        int temp=0;
        for(int i=0; i<num; i++){
            temp+=i;
        }
        int startNum = (total-temp)/num;
        int[] answer = new int[num];
        for(int i=0; i<num; i++){
            answer[i] = startNum+i;
        }
        return answer;
    }
}