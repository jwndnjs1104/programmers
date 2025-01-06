import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> remove_privacies = new ArrayList<>();
        String[] arr_today = today.split(".");
        
        //약관종류 유효기간(월수)
        //날짜 약관종류
        for(int i=0; i<privacies.length; i++){
            String[] privacy = privacies[i].split(" ");
            
            //유효기간 얻기
            int month = 0; //유효기간
            for(String term:terms)
                if(term.contains(privacy[1])) //타입일치하면
                    month = Integer.parseInt(term.substring(2)); //월수 얻기
            
            //날짜 더해서 비교하기
            //LocalDate.of(인트, 인트, 인트)
            //LocalDate.parse(charsequence 타입). 기본 구분자는 - 임
            
            //구분자를 원하는 형식으로 바꾸고 싶으면 두번째 매개변수에 구분자를 설정하면 된다.
            //import java.time.format.DateTimeFormatter;
            //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
            //LocalDate.parse(charsequence 타입, DateTimeFormatter formatter)
            LocalDate privacy_date = LocalDate.parse(privacy[0], DateTimeFormatter.ofPattern("yyyy.MM.dd"));
            privacy_date = privacy_date.plusMonths(month);
            LocalDate today_ = LocalDate.parse(today,DateTimeFormatter.ofPattern("yyyy.MM.dd"));
            if(privacy_date.isBefore(today_) || privacy_date.isEqual(today_)) remove_privacies.add(i+1); //오늘보다 이전일때 
        }
        int[] answer = new int[remove_privacies.size()];
        for(int i=0; i<remove_privacies.size(); i++) answer[i] = remove_privacies.get(i); 
        
        return answer;
    }
}