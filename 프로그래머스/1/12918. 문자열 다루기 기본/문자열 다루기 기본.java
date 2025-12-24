// 입력 : 문자열, 알파벳 대소문자 + 숫자, 길이 < 8이하
// 조건 : 입력 문자열 길이 (4 OR 6) AND 숫자로만 구성
// 출력 : 조건 부합 시 true

/*
숫자로만 이루어져 있는지, match
길이 확인
*/

class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        if (s.matches("[0-9]{4}") || s.matches("[0-9]{6}")) answer = true;
        
        return answer;
    }
}