class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            if(direction.equals("right")){
                int temp = i-1==-1?numbers.length-1:i-1;
                answer[i]=numbers[temp];
            }
            else {
                int temp = i-1==-1?numbers.length-1:i-1;
                answer[temp]=numbers[i];
            }
        }
        return answer;
    }
}