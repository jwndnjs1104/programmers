class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morseArray = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String[] letterArray = letter.split(" ");
        for(String morse:letterArray){
            for(int i=0; i<morseArray.length; i++){
                if(morse.equals(morseArray[i])) answer+=String.valueOf((char)('a'+i));
            }
        }
        return answer;
    }
}