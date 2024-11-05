class Solution {
    public int solution(int num, int k) {
        //몇 자리인지 구하기
        int numOfDigit = 1;
        int tempNum = num;
        while(true){
            if(tempNum/10==0) break;
            tempNum/=10;
            numOfDigit++;
        }
        
        int step=1;
        while(true){
            if(numOfDigit==0) return -1;
            //젤 앞 숫자 구하기
            int temp = 1;
            for(int i=1; i<numOfDigit; i++){
                if(numOfDigit!=1) temp*=10;
            }
            
            if(num/temp==k) return step;
            else{
                num=num%temp;
                step++;
                numOfDigit--;
            }
        }
    }
}