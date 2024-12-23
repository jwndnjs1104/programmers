class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++){ //기사 넘버
            int num = 0; //약수 개수
            
            for(int p=1; p*p<=i; p++){ //제곱근까지 실행함, 반복문 최소화 시키긴 했음.
                if((p*p)== i) num+=1; //제곱근이면 약수 개수 1 증가
                else if(i%p == 0) num+=2; //제곱근 아니면 약수 개수 2 증가
                
                if(num > limit) { //중간에 제한수치 넘어가면 끊기
                    answer += power;
                    break;
                }
            }
            //1 2 2 3 2
            if(num<=limit) answer += num;
        }
        
        return answer;
    }
}