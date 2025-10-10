import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        // my_string 소문자로 변경
        String lowerString = my_string.toLowerCase();
        
        // 문자 배열로 변경
        char[] c = lowerString.toCharArray();
        
        // 문자 배열 정렬
        Arrays.sort(c);
        
        // 문자열로 변경
        String answer = String.valueOf(c);

        return answer;
    }
}