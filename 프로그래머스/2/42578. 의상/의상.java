// 1. clothes 배열을 순회하며, 의상의 종류별 개수를 구한다
// 2. 답 = (A종류 수 + 1) * (B종류 수 + 1) .. - 1
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String,Integer> hm = new HashMap<>();

        for (String[] str : clothes) {
            hm.put(str[1], hm.getOrDefault(str[1], 0) + 1);
        }

        for (String str : hm.keySet()) {
            answer *= (hm.get(str) + 1);
        }
        
        answer--;

        return answer;
    }
}