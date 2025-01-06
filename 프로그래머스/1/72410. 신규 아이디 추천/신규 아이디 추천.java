class Solution {
    public String solution(String new_id) {
        //길이는 3~15자
        // 알파벳 소문자, 숫자, -  _  . 만 사용 가능
        // . 은 처음과 끝에 사용 불가, 연속으로 사용 불가
        
        //아이디 체크 프로세스
        //1. 대문자 먼저 소문자로
        //2. 해당 안되는 특수문자 제거
        //3. . 반복되는거 하나로 줄임
        //4. 처음과 끝에 위치한 . 제거
        //5. 빈문자열이면 a로 대입
        //6. 16자 이상이면 첫 15개로 줄임, 제거 후 마지막에 . 있으면 제거
        //7. 2자 이하라면 마지막 문자를 3이상 될때까지 반복
        String answer = new_id;
        answer = answer.toLowerCase(); //1
        //정규표현식 뭔지 모름;;;;
        System.out.println("1: "+answer);
        
        answer = answer.replaceAll("[^a-z0-9._-]",""); //2
        System.out.println("2: "+answer);
        
        answer = answer.replaceAll("[.]{2,}","."); //3
        System.out.println("3: "+answer);
        
        answer = answer.replaceAll("^[.]|[.]$",""); //4
        System.out.println("4: "+answer);
        
        if(answer.length() == 0) answer = "a"; //5
        System.out.println("5: "+answer);
        
        if(answer.length() >= 16) { //6
            answer = answer.substring(0,15);
            answer = answer.replaceAll("[.]$","");
        }
        System.out.println("6: "+answer);
        
        if(answer.length()<=2) { //7
            char lastChar = answer.charAt(answer.length()-1);
            int num = 3-answer.length();
            for(int i=0; i<num; i++){
                answer = answer+lastChar;    
            }
        }
        System.out.println("7: "+answer);
        
        
        return answer;
    }
}