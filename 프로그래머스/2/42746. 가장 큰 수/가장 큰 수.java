import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        // int[] -> String[]
        String[] strings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strings[i] = Integer.toString(numbers[i]);
        }
        
        // 사전순 정렬
        Arrays.sort(strings, (a, b) -> (a + b).compareTo(b + a));
        
        if (strings[strings.length - 1].equals("0")) return "0";
        
        // 역순으로 문자열 합치기
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i]);
        }
        
        String answer = sb.toString();
        return answer;
    }
}