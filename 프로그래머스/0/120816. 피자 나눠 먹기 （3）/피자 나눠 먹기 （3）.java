class Solution {
    public int solution(int slice, int n) {
        //2조각에서 10조각 -> slice 수
        //최소 한 조각 이상 먹어야함
        int x=1;
        while(true){
            if(x*slice>=n) return x;
            x++;
        }
    }
}