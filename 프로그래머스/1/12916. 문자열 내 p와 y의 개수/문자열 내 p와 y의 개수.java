class Solution {
    boolean solution(String s) {
        int numberOfP = 0;
        int numberOfY = 0;
        for(char ch:s.toLowerCase().toCharArray()){
            if(ch=='p') numberOfP++;
            else if(ch=='y') numberOfY++;
        }
        
        if(numberOfP == numberOfY) return true;
        else return false;
    }
}