// 입력 : 문자열, 알파벳 대소문자 + 숫자, 길이 < 8이하
// 조건 : 입력 문자열 길이 (4 OR 6) AND 숫자로만 구성
// 출력 : 조건 부합 시 true

/*
숫자로만 이루어져 있는지, match
길이 확인
*/

class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;
        
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        
        return true;
    }
}