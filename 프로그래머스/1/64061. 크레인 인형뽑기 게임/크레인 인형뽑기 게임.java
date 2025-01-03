import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> basket = new ArrayList<>(); //바구니 리스트 생성
        
        for(int idx:moves){
            int index = idx-1;
            for(int i=0; i<board.length; i++) {//보드 맨 위부터 탐색하기
                int doll_number = -1; //집을 인형 번호
                
                if(board[i][index]!=0) {
                    doll_number = board[i][index]; //인형 집기
                    board[i][index] = 0; //집은 자리는 인형 없애기
                }
                else if(i==0 && board[i][index]==0) { //인형이 없을 경우
                    doll_number = 0;
                }
                
                //[4,3,]
                
                if(doll_number!=-1 && doll_number!=0){
                    //바구니가 비어있지 않고 마지막에 있는 인형이랑 같은 경우
                    if( (!basket.isEmpty()) && (basket.get(basket.size()-1)==doll_number) ) {
                        basket.remove(basket.size()-1); //바구니에 있는 인형 삭제하기
                        answer++;
                    }
                    //바구니가 비어있거나   마지막에 있는 인형이랑 같지 않은 경우
                    else basket.add(doll_number); //바구니에 인형 추가하기
                    break;
                }
            }
        }
        
        return answer*2;
    }
}