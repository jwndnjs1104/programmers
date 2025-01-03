class Solution {
    public String solution(int[] numbers, String hand) {
        //각 손의 마지막 좌표를 변수로 저장해야 할 듯
        //147은 왼손 고정
        //369는 오른손 고정
        //2580만 어디 손인지 판단하면 된다.
        //좌우로 중앙이면 1, 왼쪽 오른쪽이면 0으로 판단하고, 높이는 아래서부터 0123으로 하면 될 듯
        String answer = "";
        int[] left = new int[2]; //0,0부터 시작함
        int[] right = new int[2]; //0,0부터 시작함
        for(int i=0; i<numbers.length; i++){
            int num = numbers[i];
            //넘버도 처음에 좌표로 표현하고 시작하면 계산하기 편할듯
            int[] num_coordinate = new int[2];
            num_coordinate[0]=1;
            if(num==0) num_coordinate[1]=0;
            else if(num==8) num_coordinate[1]=1;
            else if(num==5) num_coordinate[1]=2;
            else if(num==2) num_coordinate[1]=3;
            
            if(num%3==2 || num==0){
                //중앙 번호일 경우에만 거리 계산해서 구하기
                //왼손과의 거리
                int dist_from_left = Math.abs(num_coordinate[0]-left[0])+Math.abs(num_coordinate[1]-left[1]);
                //오른손과의 거리
                int dist_from_right = Math.abs(num_coordinate[0]-right[0])+Math.abs(num_coordinate[1]-right[1]);
                
                if((dist_from_left < dist_from_right) || (dist_from_left==dist_from_right && hand.equals("left"))) {
                    answer+="L";
                    left = num_coordinate;
                }
                else if((dist_from_left > dist_from_right) || (dist_from_left==dist_from_right && hand.equals("right"))) {
                    answer+="R";
                    right = num_coordinate;
                }
            }
            else if(num%3==1){
                answer+="L";
                left[0]=0;
                left[1]=3-(num/3); //높이
            }
            else if(num%3==0){
                answer+="R";
                right[0]=0;
                right[1]=4-(num/3); //높이
            }
        }
        
        return answer;
    }
}