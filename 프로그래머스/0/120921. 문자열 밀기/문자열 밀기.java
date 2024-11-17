class Solution {
    public int solution(String A, String B) {
        for(int i=0; i<=A.length(); i++){
            String temp1 = A.substring(A.length()-i,A.length());
            String temp2 = A.substring(0,A.length()-i);
            String newStr = temp1+temp2;
            if(newStr.equals(B)) return i;
        }
        return -1;
    }
}