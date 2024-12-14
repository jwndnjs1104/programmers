class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int num = 'z'-'a'+1;
        //System.out.println(num);
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z')
                answer+=String.valueOf((char)('a' + (ch-'a'+n)%num));
            else if(ch>='A' && ch<='Z')
                answer+=String.valueOf((char)('A' + (ch-'A'+n)%num));
            else if(ch==' ')
                answer+=' ';
        }
        return answer;
    }
}