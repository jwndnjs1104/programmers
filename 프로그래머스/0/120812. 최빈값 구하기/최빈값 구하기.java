class Solution {
    public int solution(int[] array) {
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]> array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        int maxTimesNum = array[0];
        int maxTimes = 1;
        int currentTimes = 1;
        int duplicated = 0;
        
        for(int i=0; i<array.length-1; i++){
            if(array[i]!=array[i+1]){
                if(maxTimes < currentTimes){
                    maxTimesNum = array[i];
                    maxTimes = currentTimes;
                    currentTimes = 1;
                    duplicated = 0;
                }
                else if(maxTimes == currentTimes){
                    maxTimes = currentTimes;
                    currentTimes = 1;
                    duplicated = 1;
                }
                else{
                    currentTimes = 1;
                }
            }
            else if(i==(array.length-2)){
                if(maxTimes < currentTimes+1){
                    maxTimesNum = array[i];
                    maxTimes = currentTimes+1;
                    duplicated = 0;
                }
                else if(maxTimes == currentTimes+1){
                    duplicated = 1;
                }
            }
            else{
                currentTimes +=1;
            }
        }
        if(duplicated==1) return -1;
        else return maxTimesNum;
    }
}