class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            String temp = s.replace(String.valueOf(s.charAt(i)),"");
            if(s.length()-temp.length()==1) answer+=String.valueOf(s.charAt(i));
        }
        char[] chArr = answer.toCharArray();
        for(int i=0; i<chArr.length-1; i++){
            for(int j=i+1; j<chArr.length; j++){
                if(chArr[i] > chArr[j]){
                    char temp = chArr[i];
                    chArr[i] = chArr[j];
                    chArr[j] = temp;
                }
            }
        }
        
        return String.valueOf(chArr);
    }
}