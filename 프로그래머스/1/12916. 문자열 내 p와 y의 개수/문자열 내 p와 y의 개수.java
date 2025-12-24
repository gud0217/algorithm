// 문자열 s의 p와 y 개수 비교
// 대소문자 섞여있음
// 둘 다 0개면 true
// 대소문자 비교 x
// 같으면 true;

/*
p개수, y개수 기록
문자열 전체 순회
    p, y 비교 후 추가
값 비교 후 리턴
*/

class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        for (char c : s.toCharArray()){
            if (c == 'p' || c == 'P') {
                p++;
                continue;
            }
            if (c == 'y' || c == 'Y') {
                y++;
                continue;
            }
        }
        
        boolean answer = true;
        if (p != y) answer = false;
        
        return answer;
    }
}