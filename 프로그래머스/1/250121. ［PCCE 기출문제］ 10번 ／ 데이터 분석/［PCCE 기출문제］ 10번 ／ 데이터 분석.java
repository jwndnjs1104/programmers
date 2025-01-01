class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        //[코드번호, 제조일, 최대수량, 현재수량]
        //이차원 리스트 만들까???????
        int column_idx = -1;
        int sorted_column_idx = -1;
        if(ext.equals("code")) column_idx = 0;
        else if(ext.equals("date")) column_idx = 1;
        else if(ext.equals("maximum")) column_idx = 2;
        else if(ext.equals("remain")) column_idx = 3;
            
        if(sort_by.equals("code")) sorted_column_idx = 0;
        else if(sort_by.equals("date")) sorted_column_idx = 1;
        else if(sort_by.equals("maximum")) sorted_column_idx = 2;
        else if(sort_by.equals("remain")) sorted_column_idx = 3;
        
        //배열 크기를 위한 개수 구하기
        int number = 0;
        for(int i=0; i<data.length; i++){
            if(data[i][column_idx] < val_ext) number++;
        }
        
        //배열에 필터링 해서 담기
        int[][] answer = new int[number][4];
        for(int[] temp:data){
            int index = 0;
            if(temp[column_idx] < val_ext) {
                while(true){
                    if(answer[index][0] == 0) {
                        answer[index] = temp;  
                        break;
                    }
                    else index++;
                }
                
            }
        }
        
        //배열 정렬하기
        for(int i=0; i<answer.length-1; i++){
            for(int j=i+1; j<answer.length; j++){
                if(answer[i][sorted_column_idx] > answer[j][sorted_column_idx]){
                    int[] temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }   
        }
        
        return answer;
    }
}