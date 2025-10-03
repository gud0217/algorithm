// 문자열 my_string의 대문자 -> 소문자, 소문자 -> 대문자로 변환한 문자열 answer을 반환.
// 대소문자 비교를 어떻게 할까?? 'A'보다 작으면 소문자 이런식으로 해볼게

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) < 'a') {
                answer.append((char)(my_string.charAt(i) + ('a' - 'A')));
            } else {
                answer.append((char)(my_string.charAt(i) - ('a' - 'A')));
            }
        }

        return answer.toString();
    }
}