class Solution {
    public int[] solution(int n, int[] numlist) {
        int arrayLength = 0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0) arrayLength++;
            else numlist[i]=0;
        }
        int[] answer = new int[arrayLength];
        int index = 0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]!=0) {
                answer[index] = numlist[i];
                index++;
            }
        }
        return answer;
    }
}