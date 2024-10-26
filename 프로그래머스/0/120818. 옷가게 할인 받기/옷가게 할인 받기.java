class Solution {
    public int solution(int price) {
        int answer = price>=500000?price*8/10:price>=300000?price*9/10:price>=100000?price*95/100:price;
        return answer;
    }
}