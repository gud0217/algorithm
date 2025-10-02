class Solution {
    public int solution(String my_string) {
        int sum = 0;

        // 1. 대소문자 제거
        String onlyNums = my_string.replaceAll("[a-zA-z]", "");
        System.out.println(onlyNums);

        // 2. 문자열 -> 문자 배열
        char[] charArr = onlyNums.toCharArray();
        
        for (int i = 0; i < charArr.length; i++) {
            sum += charArr[i] - '0';
        }
        
        int answer = sum;
        
        return answer;
    }
}