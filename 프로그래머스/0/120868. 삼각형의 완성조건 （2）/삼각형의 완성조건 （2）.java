class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        // 5 8
        //sides에 가장 긴 변이 있는 경우
        int maxSide = sides[0]>sides[1]?sides[0]:sides[1];
        int side = sides[0]>sides[1]?sides[1]:sides[0];
        int max1 = maxSide-1;
        int min1 = maxSide-side+1;
        
        for(int i=min1; i<=max1; i++){
            answer++;
        }
        
        //sides에 가장 긴 변이 없는 경우
        int max2 = sides[0]+sides[1]-1;
        int min2 = maxSide;
        
        for(int i=min2; i<=max2; i++){
            answer++;
        }
        
        //겹치는 부분 있을 경우
        int max = max1>max2?max2:max1;
        int min = min1>min2?min1:min2;
        
        if(min<=max){
            for(int i=min; i<=max; i++){
                answer--;
            }
        }
        
        
        
        


        
        return answer;
    }
}