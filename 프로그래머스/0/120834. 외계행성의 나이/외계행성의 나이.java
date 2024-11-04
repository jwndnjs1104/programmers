class Solution {
    public String solution(int age) {
        String answer = "";
        // a 아스키코드값이 67이라 할때
        // a는 0 이니까
        // 만약 5이면 67+5
        // 67 68 69 70 71 72 
        while(age!=0){
            answer = (char)(age%10+'a')+answer;
            age = age/10;
        }
        return answer;
    }
}