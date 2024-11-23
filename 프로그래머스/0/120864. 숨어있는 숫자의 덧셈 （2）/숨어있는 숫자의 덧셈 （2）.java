class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] arr = my_string.split("[a-zA-Z]+");
        for(String num:arr){
            if(!num.equals("")) answer+=Integer.parseInt(num);
        }
        return answer;
    }
}