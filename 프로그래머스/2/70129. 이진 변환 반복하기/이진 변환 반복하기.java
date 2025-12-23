// x의 모든 0 제거
// 제거 후 길이를 c
// c를 2진법으로 표현한 문자열로 변환
// s가 1이 될때까지 무한반복
// 이진 변환 횟수, 제거된 0의 수 반환

/*
s가 1이 될때까지 무한반복
이진 변환 횟수, 제거된 0의 수 기록
*/


class Solution {
    public int[] solution(String s) {
        int count = 0; // 이진 변환 횟수
        int remove = 0; // 제거된 0의 수
        
        while (!s.equals("1")) {
            int zeros = 0; // 0의 수
            for (int i = 0; i < s.length(); i++) {
                if ('0' == s.charAt(i)) zeros++;
            }
            count++;
            remove += zeros;
            int next = s.length() - zeros;
            s = Integer.toString(next, 2);
        }
        
        return new int[] {count, remove};
    }
}