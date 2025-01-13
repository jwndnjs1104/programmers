// import java.util.ArrayList;
// import java.util.List;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        
        //이차원 배열 만들기
        int[][] now = new int[friends.length][friends.length];
    
        for(String g:gifts){
            String a = g.split(" ")[0];
            String b = g.split(" ")[1];
            int m=-1;
            int n=-1;
            for(int i=0; i<friends.length; i++){
                if(a.equals(friends[i])) m=i;
                if(b.equals(friends[i])) n=i;
            }
            now[m][n]++;
        }
        
        int[] next = new int[friends.length];
        for(int i=0; i<friends.length-1; i++){
            for(int j=i+1; j<friends.length; j++){
                // System.out.printf("%s -> %s: %s\n",i,j,now[i][j]);
                // System.out.printf("%s -> %s: %s\n",j,i,now[j][i]);
                if(now[i][j] > now[j][i]) next[i]++;
                else if(now[i][j] < now[j][i]) next[j]++;
                else if(now[i][j] == now[j][i]){
                    int gisu_a = 0;
                    int gisu_b = 0;
                    for(int a=0; a<friends.length; a++) gisu_a = gisu_a + now[i][a] - now[a][i];
                    for(int b=0; b<friends.length; b++) gisu_b = gisu_b + now[j][b] - now[b][j];
                    
                    if(gisu_a > gisu_b) next[i]++;
                    else if(gisu_a < gisu_b) next[j]++;
                    // System.out.printf("gisu_a: %s\n",gisu_a);
                    // System.out.printf("gisu_b: %s\n",gisu_b);
                }
            }
        }
        
        int answer = 0;
        for(int n:next){
            // System.out.println("n: "+n);
            if(answer<n) answer = n;
        }
        
        return answer;
    }
}