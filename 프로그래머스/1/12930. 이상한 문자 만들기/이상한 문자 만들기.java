import java.util.*;

/*
1. 문자열의 모든 문자에 대해 반복
    A. 문자가 공백 문자인 경우
        A-1. 그대로 이어 붙이기
        A-2. 다음 등장하는 알파벳은 대문자
    B. 문자가 공백 문자가 아닌 경우
        B-1. 대소문자 변환, 이어 붙이기
        B-2. 다음 등장하는 알파벳은 현재와 반대
2. 구성한 문자열 반환
*/

class Solution {
    public String solution(String s) {
        StringBuilder builder = new StringBuilder();
        boolean toUpper = true;
        
        // 1
        for (char c : s.toCharArray()) {
            // A
            if (!Character.isAlphabetic(c)) {
                // A-1
                builder.append(c);
                // A-2
                toUpper = true;
            // B
            } else {
                // B-1
                if (toUpper) {
                    builder.append(Character.toUpperCase(c));
                } else {
                    builder.append(Character.toLowerCase(c));
                }
                // B-2
                toUpper = !toUpper;
            }
        }
        return builder.toString();
    }
}