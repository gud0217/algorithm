import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        // 1. 소문자 제거
        String onlyNums = my_string.replaceAll("[a-z]", "");

        // 2. 한 글자씩 분리
        String[] strArr = onlyNums.split("");

        // 3. 정수 배열 반환
        int[] nums = Arrays.stream(strArr)
                .mapToInt(Integer::parseInt)
                .toArray();

        // 4. 정렬
        Arrays.sort(nums);
        
        return nums;
    }
}