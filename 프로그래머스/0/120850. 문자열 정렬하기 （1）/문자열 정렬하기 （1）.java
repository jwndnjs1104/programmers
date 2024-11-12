class Solution {
    public int[] solution(String my_string) {
        //문자열 중에서 숫자 개수 구하기
        int numArrayLength = 0;
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(ch>='0' && ch <='9') numArrayLength++;
        }
        
        
        //배열 생성
        int[] answer = new int[numArrayLength];
        
        //모든 요소 -1로 초기화 하기
        for(int j=0; j<answer.length; j++){
            answer[j] = -1;
        }
        
        //숫자 배열에 추가하기
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(ch>='0' && ch <='9') {
                for(int j=0; j<answer.length; j++){
                    if(answer[j] == -1) {
                        answer[j] = (int)ch - '0';
                        break;
                    }
                }
            }
        }
        
        //숫자 오름차순으로 정렬하기
        for(int i=0; i<answer.length-1; i++){
            for(int j=i+1; j<answer.length; j++){
                if(answer[i]>answer[j]){
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;    
                }
            }
        }
        
        return answer;
    }
}