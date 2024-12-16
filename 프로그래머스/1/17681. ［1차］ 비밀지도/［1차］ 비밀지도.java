class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++){
            String s1 = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);
            
            //길이가 n미만인 것들은 왼쪽에 0을 채워야 됨
            if(s1.length() < n){
                int length = s1.length();
                for(int j=0; j<n-length; j++){
                    s1 = "0"+s1;
                }
            }
            if(s2.length() < n){
                int length = s2.length();
                for(int j=0; j<n-length; j++){
                    s2 = "0"+s2;
                }
            }
            
            String temp = "";
            for(int j=0; j<n; j++){
                if(s1.charAt(j)=='0' && s2.charAt(j)=='0') temp+=" ";
                else temp+="#";
            }
            answer[i] = temp;
        }
        return answer;
    }
}