class Solution {
    public String[] solution(String[] strings, int n) {
        if(strings.length == 1) return strings;
        for(int i=0; i<strings.length-1; i++){
            for(int j=i+1; j<strings.length; j++){
                //n번 인덱스 알파벳 순서로 정렬하기
                if(strings[i].charAt(n)>strings[j].charAt(n)){
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
                //n번째 알파벳이 같을 경우
                else if(strings[i].charAt(n)==strings[j].charAt(n)){
                    //처음 인덱스부터 차례대로 비교하기
                    //짧은 글자의 길이 구하기
                    int s = strings[i].length() > strings[j].length()?
                            strings[j].length():strings[i].length();
                    
                    for(int index=0; index<s; index++){
                        if(strings[i].equals(strings[j])) break;
                        else if(strings[i].charAt(index)<strings[j].charAt(index)) break;
                        else if(strings[i].charAt(index)>strings[j].charAt(index)
                               || (index == s-1 && s==strings[j].length()) ) {
                            String temp = strings[i];
                            strings[i] = strings[j];
                            strings[j] = temp;
                            break;
                        }
                    }///for
                }///else
            }///for
        }//for
        return strings;
    }
}