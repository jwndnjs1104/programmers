class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for(String word:dic){
            int answer = 1;
            for(String alpha:spell){
                if(word.indexOf(alpha)==-1) answer=2;
            }
            if(answer == 1) return answer;
        }
        return 2;
    }
}