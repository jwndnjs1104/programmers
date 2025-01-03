class Solution {
    public String solution(String[] survey, int[] choices) {
        //ABCDEFGHIJKLMNOPQRSTUVWSYZ
        //RT
        //CF
        //JM
        //AN
        //이 순서대로 나오게
        //지금 앞에 있는 문자열을 +로 계산하면 될 듯
        int[] types = new int[4];
        
        for(int i=0; i<survey.length; i++){
            String q = survey[i];
            int score = choices[i];
            int index = -1;
            char type = ' ';
            if(q.contains("R")) {
                index = 0;
                type = 'R';
            }
            else if(q.contains("C")) {
                index = 1;
                type = 'C';
            }
            else if(q.contains("J")) {
                index = 2;
                type = 'J';
            }
            else if(q.contains("A")) {
                index = 3;
                type = 'A';
            }
            
            //문자 순서대로 점수를 계산해서 합산해야함
            if(q.charAt(0)==type) types[index] -= (score-4);
            else types[index] += (score-4);
        }
        String answer = "";
        if(types[0]>=0) answer+="R";
        else answer+="T";
        
        if(types[1]>=0) answer+="C";
        else answer+="F";
        
        if(types[2]>=0) answer+="J";
        else answer+="M";
        
        if(types[3]>=0) answer+="A";
        else answer+="N";
        
        return answer;
    }
}