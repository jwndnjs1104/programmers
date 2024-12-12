class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {0,0};
        //최소공배수 구하기
        for(int i=n*m; i>=1; i--){
            if(i%n==0 && i%m==0) answer[1] = i;
        }
        
        //최대공약수 구하기
        int bigNum = n>m?n:m;
        for(int i=1; i<=bigNum; i++){
            if(n%i==0 && m%i==0) answer[0] = i;
        }
        return answer;
    }
}