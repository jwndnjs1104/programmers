import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        //정사각형 모양
        //mats에 한 변 길이가 담겨있음
        //가장 큰 돗자리 한 변 길이 반환, 없으면 -1 반환
        
        int answer = 0;
        
        //mats를 오름차순으로 정렬
        Arrays.sort(mats);
        System.out.println(Arrays.toString(mats));
        
        //차례대로 탐색을 한다고 할때 -1이 시작하는 곳을 찾고 정사각형이 될 수 있을만큼 구해서 최대값을 저장한다.
        //모든 인덱스를 완전탐색
        for(int i=0; i<park.length-(mats[0]-1); i++) {
            for(int j=0; j<park[0].length-(mats[0]-1); j++) {
                //-1위치에서 항상 인덱스가 증가하는 방향으로 탐색한다
                if(park[i][j].equals("-1") ){
                    for(int mat:mats){
                        //mat 크기만큼 영역 검사하기
                        boolean occupied = false;
                        
                        //park 크기 벗어나는지 체크
                        if( i+mat-1>=park.length || j+mat-1>=park[0].length ) break;
                        
                        for(int m=i; m<i+mat; m++){
                            for(int n=j; n<j+mat; n++){
                                if(!park[m][n].equals("-1")) {
                                    occupied = true;
                                    break;
                                }
                            }
                            if(occupied) break;
                        }
                        if(occupied) break;
                        else if(answer<mat) answer = mat;
                    }//mats 반복 for문
                }
            }
        }
        if(answer == 0 ) answer = -1;
        return answer;
    }
}