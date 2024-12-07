class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(!(s.length()==4 || s.length()==6)){
            answer = false;
        }
        
        for(char ch:s.toCharArray()){
            if(ch<'0' || ch>'9') {
                answer=false;
                break;
            }
        }
        return answer;
    }
}