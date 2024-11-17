class Solution {
    public String solution(String polynomial) {
        int x = 0;
        int notX = 0;
        String[] temp = polynomial.split(" \\+ ");
        
        for(String str:temp){
            if(str.contains("x")){
                if(str.length()==1) x+=1;
                else x+=Integer.parseInt(str.replace("x",""));
            }
            else{
                notX+=Integer.parseInt(str);
            }
        }
        
        String xStr = x==0 ? "" : String.valueOf(x).equals("1")?"x":String.valueOf(x) + "x";
        String notXStr = notX==0 ? "" : String.valueOf(notX);
        return x!=0 && notX!=0 ? xStr + " + " + notXStr : xStr+notXStr;
    }
}