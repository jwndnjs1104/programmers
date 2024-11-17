class Solution {
    public int solution(int a, int b) {
        int min = a>b?b:a;
        for(int i=min; i>1; i--){
            if(a%i==0 && b%i==0){
                a/=i;
                b/=i;
            }
        }
        
        for(int i=2; i<=b; i++){
            if(b%i==0 && i%2!=0 && i%5!=0) return 2;
        }
        return 1;
    }
}