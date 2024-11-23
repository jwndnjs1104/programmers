class Solution {
    public int solution(int[] numbers, int k) {
        //1 3 5 7 9  11 
        //2 4 6 8 10 
        //홀수면 홀수 -> 짝수 -> 반복
        //짝수면 홀수만 계속
        
        // 1 3 5
        // 2 4 
        
        //짝수명일때 홀수번 번호 사람만 던짐
        if(numbers.length%2==0){
            if(k>numbers.length/2) {
                if(k%(numbers.length/2)==0) k=numbers.length/2;
                else k%=numbers.length/2; 
            }
            
            return k*2-1;
        }
        //홀수명일때 홀수번 사람 던지고 짝수번 사람 던지고 반복
        else {
            if(k>numbers.length) {
                if(k%numbers.length==0) k=numbers.length;
                else k%=numbers.length; 
            }
            //홀수번 사람인지, k가 절반 이상부터는 짝수번 차례
            if(k <= numbers.length/2+1) return k*2-1;
            //짝수번 사람인지
            else return ( k - (numbers.length/2+1) )*2;
        }
    }
}