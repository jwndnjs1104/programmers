import java.time.LocalTime;
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        //prev 앞으로 10초
        //next 뒤로 10초
        //pos는 현재 시간
        //op_start 오프닝 시작시간
        //op_end 오프닝 종료시간
        //커멘드 이동하고 오프닝 구간에 잇으면 오프닝 종료시간으로 이동시킴
        //커멘드는 prev next 둘 중 하나
        //"mm:ss" 형식, 한자리일 경우 0을 붙인다
        //LocalTime을 쓸 수도 있을것 같다. java.time.LocalTime; 이거 쓸까 ㅋ
        String answer = "";
        LocalTime v_len = LocalTime.parse("00:"+video_len);
        System.out.println(v_len.toString());
        
        LocalTime o_start = LocalTime.parse("00:"+op_start);
        System.out.println(o_start.toString());
        
        LocalTime o_end = LocalTime.parse("00:"+op_end);
        System.out.println(o_end.toString());
        
        LocalTime now = LocalTime.parse("00:"+pos);
        System.out.println(now.toString());
        
        if(now.isAfter(o_start) && now.isBefore(o_end)){
            now = LocalTime.parse("00:"+op_end);
        }
        
        for(String command:commands){
            if(command.equals("prev")){
                
                if( now.equals(LocalTime.of(0,0,0)) || (now.isAfter(LocalTime.of(0,0,0)) && now.isBefore(LocalTime.of(0,0,0).plusSeconds(10)))){
                    now = LocalTime.of(0,0,0);
                }
                else {
                    now = now.minusSeconds(10);
                }
                
                if( now.equals(o_start) || (now.isAfter(o_start) && now.isBefore(o_end)) ){
                    now = LocalTime.parse("00:"+op_end);
                }
            }
            else if(command.equals("next")){
                //
                if( now.equals(v_len) || (now.isAfter(v_len.minusSeconds(10)) && now.isBefore(v_len))){
                    now = LocalTime.parse("00:"+video_len);
                }
                else {
                    now = now.plusSeconds(10);
                }
                
                if( now.equals(o_start) || (now.isAfter(o_start) && now.isBefore(o_end)) ){
                    now = LocalTime.parse("00:"+op_end);
                }
            }
        }
        answer = now.toString();
        if(answer.length()==5) answer+=":00";
        answer = answer.substring(3);
        
        return answer;
    }
}