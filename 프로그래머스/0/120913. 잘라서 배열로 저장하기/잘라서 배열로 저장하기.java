class Solution {
    public String[] solution(String my_str, int n) {
        // 반환 할 문자열 배열 길이 구하기
        int length = my_str.length() / n;
        if (my_str.length() % n != 0) {
            length++;
        }
        String[] answer = new String[length];
        
        // 꽉차는 문자열 배열에 저장
        for (int i = 0; i < length - 1; i++) {
            answer[i] = my_str.substring(i * n, (i+1) * n);
        }
        
        // 남은 문자열 배열에 저장
        answer[length - 1] = my_str.substring((length - 1) * n);
        
        return answer;
    }
}