import java.time.LocalDate;
class Solution {
    public String solution(int a, int b) {
        //단순히 각 월에 일수가 몇인지 하드코딩해서 요일 측정할 수 있음
        //또는 java.time.LocalDate 클래스 이용
        return LocalDate.of(2016,a,b).getDayOfWeek().toString().substring(0,3).toUpperCase();
    }
}