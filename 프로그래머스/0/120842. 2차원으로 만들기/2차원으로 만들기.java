class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        //인덱스로 접근해야지
        //012345678
        //3개씩이면
        //012 345 678
        
        for(int i=0; i<num_list.length; i++){
            answer[i/n][i%n] = num_list[i];
        }
        return answer;
    }
}