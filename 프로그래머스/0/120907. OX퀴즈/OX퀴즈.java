class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<quiz.length; i++){
            String str = quiz[i];
            String num1;
            String num2;
            String result;
            String calc;
            
            if(str.contains(" + ")) calc = " \\+ ";
            else calc = " - ";
            
            num1 = str.split(calc)[0];
            num2 = str.split(calc)[1].split(" = ")[0];
            result = str.split(calc)[1].split(" = ")[1];
            
            if(str.contains(" + "))
                answer[i] = Integer.parseInt(num1) + Integer.parseInt(num2) == Integer.parseInt(result)?"O":"X";
            else answer[i] = Integer.parseInt(num1) - Integer.parseInt(num2) == Integer.parseInt(result)?"O":"X";
            
        }
        return answer;
    }
}