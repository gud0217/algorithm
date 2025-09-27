import java.util.*;

class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        
        // 모스부호가 담긴 배열
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        // key : 모스부호, value : a-z
        Map<String, String> map = new HashMap<>();
        int k = 0;
        
        // 모스부호가 담긴 배열 순회하며, value에 a~z 넣기
        for (String str : mos) {
            map.put(str, String.valueOf((char)('a' + k)));
            k++;
        }
        
        // letter을 공백으로 분리하여, String 배열
        String[] arr = letter.split(" ");
        
        // String 배열 순회하며, 모스부호에 맞는 value 구해서 더하기
        for (String str : arr) {
            sb.append(map.get(str));
        }
        
        // StringBuilder -> String
        String answer = sb.toString();
        
        return answer;
    }
}