class Solution {
    public int solution(String before, String after) {
        char[] afterChArr = after.toCharArray();
        for(int i=0; i<before.length();i++){
            for(int j=0; j<before.length();j++){
                if(before.charAt(i) == afterChArr[j]) {
                    afterChArr[j]='1';
                    break;
                }
            }
        }
        for(char ch:afterChArr){
            if(ch!='1') return 0;
        }
        return 1;
    }
}