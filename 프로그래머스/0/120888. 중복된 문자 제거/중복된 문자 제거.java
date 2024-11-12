class Solution {
    public String solution(String my_string) {
        
        String answer = "";
        String DuplicatedStr = "";

        for(int i=0; i<my_string.length(); i++){
            int isDuplicated = 0;
            if(my_string.charAt(i)=='0') continue;
            for(int j=i+1; j<my_string.length(); j++){
                if(my_string.charAt(i) == my_string.charAt(j)){
                    isDuplicated=1;
                }
            }
            if(isDuplicated == 1){
                if(!DuplicatedStr.contains(""+my_string.charAt(i))) DuplicatedStr+=my_string.charAt(i);
                answer += my_string.charAt(i);
                my_string = my_string.replace(""+my_string.charAt(i),"0");
            }
            else answer += my_string.charAt(i);
            
        }
        return answer;
    }
}