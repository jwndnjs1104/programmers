import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String dartResult) {
        //숫자 개수 세고, 숫자 개수만큼 크기의 배열 만들어서 숫자문자열의 인덱스를 요소로
        //혹은 정규표현식으로 자르기
        List<String> darts = new ArrayList<>();
        int index = 0;
        for(int i=2; i<dartResult.length(); i++){
            char now = dartResult.charAt(i);
            //System.out.println("now:"+now);
            char prev = dartResult.charAt(i-1);
            //System.out.println("prev:"+prev);
            if((now >= '0' && now <= '9') && (prev > '9' || prev < '0')){
                darts.add(dartResult.substring(index,i));
                index = i;
            }
        }
        darts.add(dartResult.substring(index)); //마지막꺼
        
        //for(String s:darts) System.out.println(s);

        int[] scores = new int[darts.size()];
        for(int i=0; i<darts.size(); i++){ //리스트 각 요소 점수로 환산
            int score = 0;
            String str = darts.get(i);
            //replace는 정규표현식이 안먹히나???
            //정규표현식 쓰려면 replaceAll이 맞다. 명심하자
            int base_score = Integer.parseInt(str.replaceAll("[a-zA-Z]+","").replace("#","").replace("*",""));
            if(str.contains("S")) score += base_score; //제곱 메소드 기억 안남
            else if(str.contains("D")) score += Math.pow(base_score, 2);
            else if(str.contains("T")) score += Math.pow(base_score, 3);
            
            scores[i] = score;
            
            if(str.contains("*")) {
                scores[i] *= 2;
                if(i-1 >= 0) scores[i-1] *= 2;
            }
            else if(str.contains("#")) {
                scores[i] = -scores[i];
            }
        }
        
        int answer = 0;
        for(int num:scores) answer+=num;
        return answer;
    }
}