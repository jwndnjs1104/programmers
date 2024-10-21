class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        // 2개의 분수가 기약분수인지 판별하고
        // 두 분수의 분모의 최소공배수를 구해서 더하면 그 분수는 기약분수가 될 것
        // int small1 = numer1 < denom1 ? numer1 : denom1;
        // int small2 = numer2 < denom2 ? numer2 : denom2;
        // for(int i = small1/2; i > 1; i--){
        //     if(numer1%i==0 && denom1%i==0){
        //         numer1/=i;
        //         denom1/=i;
        //     }
        // }
        // for(int i = small1/2; i > 1; i--){
        //     if(numer2%i==0 && denom2%i==0){
        //         numer2/=i;
        //         denom2/=i;
        //     }
        // }
        //최소공배수는 어떻게 구할까?????
        //4랑 6이면
        int numer3 = numer1*denom2 + numer2*denom1;
        int denom3 = denom1 * denom2;
        int small3 = numer3 > denom3 ? denom3 : numer3;
        for(int i = small3/2; i > 1; i--){
            if(numer3%i==0 && denom3%i==0){
                numer3/=i;
                denom3/=i;
            }
        }
        int[] answer = {numer3, denom3};
        return answer;
    }
}