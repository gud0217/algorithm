// 가위바위보 낸 문자열들이 025025025처럼 담김
// 나는 다 이기는 문자열을 리턴해야함
// (0,5) (2,0) (5,2)
// 하나씩 끊어 읽어야함
import java.util.*;

class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        Map<String, String> map = new HashMap<>();
        map.put("0", "5");
        map.put("2", "0");
        map.put("5", "2");
        
        String[] rspArr = rsp.split("");
        
        for (String str : rspArr) {
            sb.append(map.get(str));
        }
        
        String answer = sb.toString();
        return answer;
    }
}