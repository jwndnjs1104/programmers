class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String origin_color = board[h][w];
    
        //상하좌우 순서로
        int[] dw = {0,0,-1,1};
        int[] dh = {1,-1,0,0};
        
        
        for(int i=0; i<dw.length; i++){
            int w_check = w+dw[i];
            if(w_check < 0 || w_check >= board.length) continue;
            
            int h_check = h+dh[i];
            if(h_check < 0 || h_check >= board.length) continue;
            
            //체크하기
            if(origin_color.equals(board[h_check][w_check])) answer++;
        } 
        
        return answer;
    }
}