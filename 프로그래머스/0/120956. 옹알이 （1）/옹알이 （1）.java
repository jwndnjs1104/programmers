class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] prons= {"aya","ye","woo","ma"};
        for(int i=0; i<babbling.length; i++){
            int leng = 0;
            for(int j=0; j<prons.length; j++){
                if(babbling[i].indexOf(prons[j]) != -1) leng += prons[j].length();
            }
            if(babbling[i].length() == leng) answer+=1;
        }
        return answer;
    }
}