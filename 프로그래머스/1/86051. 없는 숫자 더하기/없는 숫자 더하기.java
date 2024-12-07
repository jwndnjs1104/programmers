class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        String nums = "0123456789";
        for(int i:numbers) 
            nums = nums.replace(String.valueOf(i),"");
        
        for(char ch:nums.toCharArray())
            answer+=(ch-'0');
        
        return answer;
    }
}