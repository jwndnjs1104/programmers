class Solution {
    public String solution(String my_string, String letter) {
        while(my_string.indexOf(letter)!=-1){
            my_string = my_string.replace(letter,"");
        }
        String answer = my_string;
        // for(int i=0;i<my_string.length(); i++){
        //     if(!my_string.charAt(i).equals(letter)) answer += my_string.indexOf(i);
        // }
        return answer;
    }
}