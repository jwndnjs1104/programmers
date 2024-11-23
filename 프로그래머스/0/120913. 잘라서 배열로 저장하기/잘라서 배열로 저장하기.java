class Solution {
    public String[] solution(String my_str, int n) {
        //인덱스로
        int index = my_str.length()%n==0?my_str.length()/n:my_str.length()/n+1;
        String[] answer = new String[index];
        
        for(int i=0; i<answer.length; i++){
            if(i!=answer.length-1) answer[i]=my_str.substring(i*n,(i+1)*n);
            else answer[i]=my_str.substring(i*n);
        }
        
        return answer;
    }
}