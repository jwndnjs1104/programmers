import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
//         //goal에서 한단어씩 꺼내서
//         //card1과 card2를 모두 순회하면서 없는 경우 No를 return
//         //아 ㅅㅂ 순서도 지켜야 하네
//         String answer = "Yes";
//         List<String> list1 = new ArrayList<>();
//         List<String> list2 = new ArrayList<>();
//         List<String> cards1List = Arrays.asList(cards1);
//         List<String> cards2List = Arrays.asList(cards2);
        
//         //어디 쪽에 있는지 나누고 각 요소들은 goal에 있는 순서와 같음
//         for(String str:goal){
//             //contains쓰면 주소비교니까 안되겠지 멍청아
//             //순회하면서 String끼리 비교하는수밖에 없네
//             for(String s:cards1List){
//                 if(s.equals(str)) {
//                     list1.add(str);
//                     break;
//                 }
//             }
            
//             for(String s:cards2List){
//                 if(s.equals(str)) {
//                     list2.add(str);
//                     break;
//                 }
//             }
//         }
        
//         //순서 검사하기
//         //두 단어씩 서로의 인덱스를 비교해서 순서가 맞는지 체크한다
//         if(list1.size()>1){
//             for(int i=0; i<list1.size()-1; i++){
//                 for(int j=i+1; j<list1.size(); j++){
//                     if(cards1List.indexOf(list1.get(i)) > cards1List.indexOf(list1.get(j))) return "No";
//                 }
//             }
//         }
        
//         if(list2.size()>1){
//             for(int i=0; i<list2.size()-1; i++){
//                 for(int j=i+1; j<list2.size(); j++){
//                     if(cards2List.indexOf(list2.get(i)) > cards2List.indexOf(list2.get(j))) return "No";
//                 }
//             }
//         }
        
//         return "Yes";
        
        int index1 = -2;
        int index2 = -2;
        List<String> cards1List = Arrays.asList(cards1);
        List<String> cards2List = Arrays.asList(cards2);
        for(String s:goal){
            if(cards1List.contains(s)) {
                if(index1 > cards1List.indexOf(s)) return "No";
                else if(index1!=-2 && index1+1 != cards1List.indexOf(s)) return "No";
                else index1=cards1List.indexOf(s);
            }
            
            if(cards2List.contains(s)) {
                if(index2 > cards2List.indexOf(s)) return "No";
                else if(index2!=-2 && index2+1 != cards2List.indexOf(s)) return "No";
                else index2=cards2List.indexOf(s);
            }
        }
        
        return "Yes";
    }
}