// HashMap<종류,개수>
// (종류별 개수 + 1) * ... ( )

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String,Integer> hm = new HashMap<>();
        
        // 해시맵에 종류 별 개수 저장
        for (String[] str : clothes) {
            hm.put(str[1], hm.getOrDefault(str[1], 0) + 1);
        }
        
        // 종류 별 개수 곱하기
        for (String s : hm.keySet()) {
            answer *= (hm.get(s) + 1);
        }
        
        // 다 안입는 경우 제외
        return answer - 1;
    }
}