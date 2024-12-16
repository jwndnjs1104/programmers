class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i=0; i<photo.length; i++){
            int score = 0;
            //각 이름을 찾고 해당 인덱스의 점수를 score에 더한다
            for(String n:photo[i]){
                for(int j=0; j<name.length; j++){
                    if(name[j].equals(n)) {
                        score+=yearning[j];
                        break;
                    }
                }
            }
            answer[i] = score;
        }
        return answer;
    }
}