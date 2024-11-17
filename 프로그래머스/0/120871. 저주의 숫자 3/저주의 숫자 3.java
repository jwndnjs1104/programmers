class Solution {
    public int solution(int n) {
        // 1 2 3 4 5 6 7  8  9  10 11 12 13 14 15 16 17
        // 1 2 4 5 7 8 10 11 14 16
        int order = 1;
        int threeXNum = 1;
        while(true){
            if(order==n) return threeXNum;
            
            while(true){
                threeXNum++;

                //3이 포함된 수인가?
                int temp = threeXNum;
                boolean isIncludedThree = false;
                boolean isDividedThree = false;
                while(true){
                    if(temp%10 == 3) {
                        isIncludedThree=true;
                        break;
                    }
                    if(temp/10 != 0) temp/=10;
                    else break;
                }

                //3으로 나눌수 있는 수인가?
                if(threeXNum%3==0) isDividedThree=true;

                if(!isIncludedThree && !isDividedThree) {
                    order++;
                    break;
                }
            }
        }
    }
}