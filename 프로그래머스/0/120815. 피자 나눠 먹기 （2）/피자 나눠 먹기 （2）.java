class Solution {
    public int solution(int n) {
        if(n%6==0) return n/6;
        else{
            int x = 1;
            while(true){
                if(x*6%n==0) return x;
                x++;
            }
        }
    }
}