class Solution {
    public int solution(String s) {
        // s를 문자열 배열로
        // 더하고, 이전 값 저장
        int answer = 0;
        int pre = 0;
        String[] strArr = s.split(" ");
        
        for(String a : strArr) {
            if(a.equals("Z")) {
                answer -= pre;
            } else {
                answer += Integer.valueOf(a).intValue();
                pre = Integer.valueOf(a).intValue();
            }
        }
        return answer;
    }
}