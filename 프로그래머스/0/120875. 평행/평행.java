class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        // 0 1 2 3
        for(int i=1; i<dots.length; i++){
            String index = "123";
            double gradient1 = (dots[0][1]-dots[i][1])/((double)dots[0][0]-dots[i][0]);
            String[] others = index.replace(String.valueOf(i),"").split("");
            double gradient2 = (dots[Integer.parseInt(others[0])][1] - dots[Integer.parseInt(others[1])][1])/((double)dots[Integer.parseInt(others[0])][0] - dots[Integer.parseInt(others[1])][0]);
            
            if(gradient1 == gradient2){
                answer=1;
                break;
            }
        }
        return answer;
    }
}