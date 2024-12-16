class Solution {
    public String solution(int[] food) {
        String left = "";
        String right = "";
        for(int i=1; i<food.length; i++){
            for(int num=1; num<=food[i]/2; num++){
                left += i;
                right = i+right;    
            }
            
        }
        return left+"0"+right;
    }
}