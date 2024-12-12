class Solution {
    public String solution(String s) {
        String answer = "";
        
        //단어별로 배열로 바꾸기
        s = s.toLowerCase();
        
        int wordIndex = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' ') {
                answer += " ";
                wordIndex = 0;
            }
            else if(wordIndex%2==0){
                answer += String.valueOf(s.charAt(i)).toUpperCase();
                wordIndex++;
            }
            else{
                answer += s.charAt(i);
                wordIndex++;
            }
        }
        return answer;
    }
}