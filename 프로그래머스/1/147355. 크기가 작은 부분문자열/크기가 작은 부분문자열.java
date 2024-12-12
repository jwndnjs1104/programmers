class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i=0; i<t.length()-p.length()+1; i++){
            String temp = "";
            if(i==t.length()-p.length()) temp=t.substring(i);
            else temp = t.substring(i,i+p.length());
            long t1 = Long.valueOf(temp);
            long p1 = Long.valueOf(p);
            if(t1 <= p1 ) answer++;
            //왜 런타임 에러????
            
        }
        return answer;
    }
}