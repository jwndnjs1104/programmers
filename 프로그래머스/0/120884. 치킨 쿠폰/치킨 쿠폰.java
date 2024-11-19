class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int totalCoupon = chicken;
        while(true){
            if(totalCoupon/10 == 0) break;
            answer += totalCoupon/10;
            int serviceChicken = totalCoupon/10;
            int restCoupon = totalCoupon%10;
            totalCoupon = restCoupon+serviceChicken;
        }
        return answer;
    }
}