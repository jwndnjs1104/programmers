class Solution {
    public int solution(int n) {
        int answer = 0;
        String ternary = "";
        int maxExponent = 0;
        int exp = 0;
        
        //최대 지수 구하기
        while(true){
            if(Math.pow(3, exp) > n) {
                maxExponent = exp-1;
                break;
            }
            else exp++;
        }
        System.out.println(maxExponent);
        //System.out.println(Math.pow(3,3));
        //45
        // 27 9 3 1
        // 1  2 0 0
        
        //자리수에 해당하는 값 구하기
        for(int e=maxExponent; e>=0; e--){ //e는 해당하는 자리의 지수
            for(int i=1; i<3; i++){ //i는 해당 자리의 값
                if(Math.pow(3,e)*i > n) {
                    ternary += String.valueOf(i-1);
                    n = n - (int)(Math.pow(3,e)*(i-1));
                    break;
                }
                else if(i==2 && Math.pow(3,e)*i <= n) {
                    ternary += String.valueOf(i);
                    n = n - (int)(Math.pow(3,e)*(i));
                    break;
                }
            }
            System.out.println("ternary: "+ternary);
            System.out.println("n: "+n);
        }
        
        
        //3진수 뒤집기
        String newTernary = "";
        for(int i=ternary.length()-1; i>=0; i--){
            newTernary += ternary.charAt(i);
        }
        
        //일의자리부터 시작해서 10진수로 바꾸기
        for(int i=newTernary.length()-1; i>=0; i--){
            answer += (int)Math.pow(3,newTernary.length()-1-i)*(newTernary.charAt(i)-'0');
        }
        return answer;
    }
}