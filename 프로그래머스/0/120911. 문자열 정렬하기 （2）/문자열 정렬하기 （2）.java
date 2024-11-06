class Solution {
    public String solution(String my_string) {
        char[] array = new char[my_string.length()];
        for(int i=0; i<my_string.length(); i++){
            my_string = my_string.toLowerCase();
            array[i] = my_string.charAt(i);
        }
        
        for(int i=0; i<my_string.length()-1; i++){
            for(int j=i+1; j<my_string.length(); j++){
                if(array[i]>array[j]){
                    char temp=array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }   
        }
        
        String answer = "";
        for(char ch:array){
            answer+=ch;
        }
        
        return answer;
    }
}