import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(char num:String.valueOf(n).toCharArray())
            answer += (num-'0');

        return answer;
    }
}