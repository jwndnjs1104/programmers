class Solution {
    public int solution(String my_string) {
        String[] eq = my_string.split(" ");
        int answer = Integer.parseInt(eq[0]);
        
        for(int i=1; i<eq.length-1; i++){
            if(eq[i].equals("+")){
                answer += Integer.parseInt(eq[i+1]);
            }
            else if(eq[i].equals("-")){
                answer -= Integer.parseInt(eq[i+1]);
            }
        }
        return answer;
    }
}