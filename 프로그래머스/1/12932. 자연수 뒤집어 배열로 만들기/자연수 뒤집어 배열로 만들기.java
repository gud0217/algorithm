// 정수형 -> 문자열

class Solution {
    public int[] solution(long n) {   
        String str = String.valueOf(n); // 정수형 -> 문자열
        
        StringBuilder sb = new StringBuilder(str); // String -> StringBuilder
        
        sb.reverse(); // 뒤집기
        
        str = sb.toString();
    
        int[] answer = new int[str.length()];
        
        char[] charArr = str.toCharArray();
        
        for (int i = 0; i < str.length(); i++) {
            answer[i] = charArr[i] - '0';
        }
        
        return answer;
    }
}