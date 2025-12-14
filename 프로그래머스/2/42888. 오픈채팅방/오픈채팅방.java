/* [
"Enter uid1234 Muzi",
"Enter uid4567 Prodo",
"Leave uid1234",
"Enter uid1234 Prodo",
"Change uid4567 Ryan"
]
*/

// 유저의 최종 닉네임을 알아야 함.
// 유저가 들어갔다 나갔다 했을 때 다 알아야 함.
// HashMap <아이디, 닉네임>
// 전체 순회 하며, [입/출 아이디] 이건 기록해두고, 닉네임 아이디 따로 기록?
// 이후 기록 보며 입출 아이디 닉네임 전부 출력하기
import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> hm = new HashMap<>();
        int answerSize = 0; // 출력 횟수
        // record 전체 순회
        for (String s : record) {
            // 문자열 -> 문자 배열 (공백 기준)
            String[] sArr = s.split(" ");
            // <아이디, 닉네임>
            if (!sArr[0].equals("Leave")) {
                hm.put(sArr[1], sArr[2]);
            }
            // 출력 수
            if (!sArr[0].equals("Change")) {
                answerSize++;
            }
        }
        
        // 문자열 기록
        String[] answer = new String[answerSize];
        int idx = 0;
        for (String s : record) {
            // 문자열 -> 문자 배열 (공백 기준)
            String[] sArr = s.split(" ");
            
            // [닉네임]님이 [들어왔/나갔]습니다
            if (sArr[0].equals("Enter")) {
                answer[idx] = hm.get(sArr[1]) + "님이 들어왔습니다.";
                idx++;
            } else if(sArr[0].equals("Leave")) {
                answer[idx] = hm.get(sArr[1]) + "님이 나갔습니다.";
                idx++;
            }
        }
        return answer;
    }
}