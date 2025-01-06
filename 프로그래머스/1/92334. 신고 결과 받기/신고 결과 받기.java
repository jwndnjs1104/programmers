import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        //신고 누적 개수 리스트를 만들자
        //신고한 사람이 신고가 k개가 넘으면 리포트에 1을 더한다
        
        //결론은 신고리포트결과, 신고누적개수 배열 두개를 만들면 될 듯
        //인덱스 순서는 id_list와 동일하게 하면 됨
//         int[] answer = new int[id_list.length]; 
//         int[] report_num = new int[id_list.length];
        
//         //먼저 신고누적개수 배열 구하기
//         for(int i=0; i<report.length; i++){
//             String reported_name = report[i].split(" ")[1];
//             for(int j=0; j<id_list.length; j++){
//                 if(id_list[j].equals(reported_name)) {
//                     report_num[j]++;
//                     break;
//                 }
//             }
//         }
        
//         //누적개수가 k개가 넘는 이름만 골라서 신고한 사람 구하기
//         for(int i=0; i<report_num.length; i++){
//             String stop_name = ""; //정지된 사람
//             if(report_num[i] >= k) stop_name = id_list[i];
//             System.out.printf("%s번째 신고수: %s%n",i+1,report_num[i]);
//             //System.out.println(stop_name);
            
//             //리포트한 사람이름 구해서 피드백해주기
//             for(int j=0; j<report.length; j++){
//                 if(stop_name.equals(report[j].split(" ")[1]) ){
//                     String report_from = report[j].split(" ")[0];
                    
//                     for(int a=0; a<id_list.length; a++){
//                         if(id_list[a].equals(report_from)) {
//                             answer[a]++;
//                             break;
//                         }
//                     }
//                 }
//             }
//         }
        
        //이러면 같은 사람을 계속 신고한거 어떻게 잡을건데
        //이거보다 신고받은 사람을 기준으로 신고한 사람들을 누적시키면 중복 체크가 더 쉬울듯
        //이중 리스트, 각 리스트의 0번째 인덱스는 신고당한 사람 이름임, 그 후로는 신고한 사람들 추가할 것임
        
        int[] answer = new int[id_list.length];
        List<List<String>> lists = new ArrayList<>();
        
        for(String id:id_list){
            List<String> temp = new ArrayList<>();
            temp.add(id);
            lists.add(temp);
        }
        
        for(String r:report){
            String reporter = r.split(" ")[0];
            String reported = r.split(" ")[1];
            for(List<String> list:lists){
                if(list.get(0).equals(reported) && (!list.contains(reporter)) ){
                    list.add(reporter);
                }
            }
        }
        
        for(List<String> list:lists){
            if(list.size() >= k+1){
                for(int i=1; i<list.size(); i++){
                    for(int j=0; j<id_list.length; j++){
                        if(id_list[j].equals(list.get(i))) answer[j]++;
                    }
                }
            }
        }
        
        return answer;
    }
}