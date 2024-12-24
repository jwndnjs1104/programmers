class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int a=0; a<nums.length-2; a++){
            for(int b=a+1; b<nums.length-1; b++){
                for(int c=b+1; c<nums.length; c++){
                    
                    int sum = nums[a]+nums[b]+nums[c];
                    boolean isPrime = true;
                    for(int i=2; i*i<=sum; i++){
                        if(sum%i==0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if(isPrime) answer++;
                }
            }
        }

        return answer;
    }
}