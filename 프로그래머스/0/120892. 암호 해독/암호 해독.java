// 문자열 cipher에서, code의 배수번째 글자만 문자열로 return

class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();

        for(int i = code -1; i < cipher.length(); i += code) {
            sb.append(cipher.charAt(i));
        }

        String answer = sb.toString();

        return answer;
    }
}