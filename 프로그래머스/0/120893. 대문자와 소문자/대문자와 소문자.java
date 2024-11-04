class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            String temp = "";
            if(ch >= 'a' && ch <= 'z') answer += (temp+ch).toUpperCase();
            else answer += (temp+ch).toLowerCase();
        }
        return answer;
    }
}