class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int friendHeight:array){
            if(height<friendHeight) answer+=1;
        }
        return answer;
    }
}