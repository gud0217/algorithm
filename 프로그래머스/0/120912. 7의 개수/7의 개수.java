import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        // 정수 배열 순회
        for (int i : array) {
            // 정수 -> 문자열 변환
            String intString = String.valueOf(i);
            // 문자열 -> 문자 배열 변환
            char[] charArray = intString.toCharArray();
            // 문자 배열에 '7'이 몇개인지 확인
            for (char c : charArray) {
                if (c == '7') {
                    answer++;
                }
            }
        }

        return answer;
    }
}