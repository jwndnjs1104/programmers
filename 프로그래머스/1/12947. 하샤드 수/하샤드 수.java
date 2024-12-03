class Solution {
    public boolean solution(int x) {
        int sum = 0;
        //자리수 합 구하기
        for(char ch:String.valueOf(x).toCharArray())
            sum += (ch-'0');
        if(x%sum==0) return true;
        else return false;
    }
}