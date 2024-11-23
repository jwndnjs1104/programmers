class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        for(int i=0; i<arr.length; i++){
            if(!arr[i].equals("Z")){
                if(!(i==arr.length-1) && !arr[i+1].equals("Z")) answer += Integer.parseInt(arr[i]);
                else if(i==arr.length-1) answer += Integer.parseInt(arr[i]);
            } 
        }
        return answer;
    }
}