class Solution {
    public long solution(long n) {
        char[] chArr = String.valueOf(n).toCharArray();
        for(int i=0; i<chArr.length-1; i++){
            for(int j=i+1; j<chArr.length; j++){
                if(chArr[i]<chArr[j]){
                    char temp = chArr[i];
                    chArr[i] = chArr[j];
                    chArr[j] = temp;
                }
            }
        }
        return Long.valueOf(String.valueOf(chArr));
    }
}