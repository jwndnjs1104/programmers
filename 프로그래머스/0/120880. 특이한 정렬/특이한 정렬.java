class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] distance = new int[numlist.length];
        for(int i=0; i<numlist.length; i++){
            distance[i] = numlist[i]>n ? numlist[i]-n : n-numlist[i];
        }
        
        for(int i=0; i<numlist.length-1; i++){
            for(int j=i+1; j<numlist.length; j++){
                if(distance[i]>distance[j]){
                    int temp = distance[i];
                    distance[i] = distance[j];
                    distance[j] = temp;
                    temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        
        for(int i=0; i<numlist.length-1; i++){
            if(distance[i]==distance[i+1] && numlist[i]<numlist[i+1]){
                int temp = distance[i];
                distance[i] = distance[i+1];
                distance[i+1] = temp;
                temp = numlist[i];
                numlist[i] = numlist[i+1];
                numlist[i+1] = temp;
            }
        }
        
        return numlist;
    }
}