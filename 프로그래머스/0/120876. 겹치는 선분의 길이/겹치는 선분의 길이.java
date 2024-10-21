class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int start_3 = lines[0][0];
        int end_3 = lines[0][1];
        for(int i=0; i<lines.length; i++){
            start_3 = lines[i][0] > start_3 ? lines[i][0] : start_3 ;
            end_3 = lines[i][1] < end_3 ? lines[i][1] : end_3 ;
            for(int j=i+1; j<lines.length; j++){
                int start  = lines[i][0] >= lines[j][0] ? lines[i][0] : lines[j][0];
                int end  = lines[i][1] <= lines[j][1] ? lines[i][1] : lines[j][1];
                int length = start >= end ? 0 : end - start;
                answer += length;
            }
        }
        if(end_3 >= start_3) answer -= 2*(end_3-start_3);
        return answer;
    }
}