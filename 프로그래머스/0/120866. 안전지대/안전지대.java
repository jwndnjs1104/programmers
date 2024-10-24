class Solution {
    public int solution(int[][] board) {
        int[][] map = new int[board.length][board.length];
        for(int i=0;i<board.length; i++){
            for(int j=0; j<board.length;j++){
                if(board[i][j]==1){
                    int m_min = i-1<=0?0:i-1;
                    int m_max = i+1>board.length-1?board.length-1:i+1;
                    int n_min = j-1<=0?0:j-1;
                    int n_max = j+1>board.length-1?board.length-1:j+1;
                    for(int m=m_min; m<=m_max; m++){
                        for(int n=n_min; n<=n_max; n++){
                            map[m][n]=1;
                        }
                    }
                }
            }
        }
        
        int answer = 0;
        for(int i=0;i<board.length; i++){
            for(int j=0; j<board.length;j++){
                if(map[i][j]==0) answer++;
            }
        }
        return answer;
    }
}