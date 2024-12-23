import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
// import java.util.stream;
import java.util.stream.Collectors;
import java.util.Comparator;
class Solution {
    public int solution(int k, int m, int[] score) {
        //순서대로
        //높은순으로 정렬 후 m개씩 끊는다
        //박스별 최소점수 구해서 가격 구하면 끝
        int answer = 0;
        List<Integer> scoreList = new ArrayList<>(); //리스트 만들기
        for(int i:score) scoreList.add(i);  
        
        scoreList = scoreList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); //오름차순 정렬
        List<Integer> subList = new ArrayList<>();
        for(int i=0; i<scoreList.size()/m; i++){ //큰것부터 시작
            subList = scoreList.subList(i*m,(i+1)*m); //m개씩 자르기
            int min = subList.get(0);
            for(int number:subList) {
                if(min>number) min=number;
            }
            answer += min*m;
        }
        return answer;
    }
}