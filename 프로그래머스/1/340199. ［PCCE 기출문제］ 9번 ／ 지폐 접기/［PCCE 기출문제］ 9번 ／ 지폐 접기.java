import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        // 순서 바꾸기 편하게 리스트로 함.
        List<Integer> billList = new ArrayList<>();
        for(int b:bill){
            billList.add(b);
        }
        
        // 오름차순으로
        if(wallet[0] > wallet[1]) {
            int temp = wallet[0];
            wallet[0] = wallet[1];
            wallet[1] = temp;
        }
        
        while(true){
            //지폐 오름차순으로
            billList = billList.stream().sorted().collect(Collectors.toList());
            if(billList.get(0) <= wallet[0] && billList.get(1) <= wallet[1]) return answer;
            else {
                billList.set(1, billList.get(1)/2);
                answer++;
            }
        }
    }
}