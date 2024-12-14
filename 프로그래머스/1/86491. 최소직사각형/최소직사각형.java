class Solution {
    public int solution(int[][] sizes) {
        int big=sizes[0][0]>sizes[0][1]?sizes[0][0]:sizes[0][1];
        int small=sizes[0][0]>sizes[0][1]?sizes[0][1]:sizes[0][0];
        for(int i=0; i<sizes.length; i++){
            int b=sizes[i][0]>sizes[i][1]?sizes[i][0]:sizes[i][1];
            int s=sizes[i][0]>sizes[i][1]?sizes[i][1]:sizes[i][0];
            if(b>big) big=b;
            if(s>small) small=s;
        }
        return big*small;
    }
}