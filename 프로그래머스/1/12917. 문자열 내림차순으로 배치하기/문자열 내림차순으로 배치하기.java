class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chArr = s.toCharArray();
        for(int i=0; i<s.length()-1; i++){
            for(int j=i+1; j<s.length(); j++){
                if(chArr[i]<chArr[j]){
                    char temp = chArr[i];
                    chArr[i] = chArr[j];
                    chArr[j] = temp;
                }
            }
        }
        answer = String.valueOf(chArr);
        return answer;
    }
}