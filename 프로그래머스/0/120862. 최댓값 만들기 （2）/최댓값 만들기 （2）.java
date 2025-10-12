// 정수 배열 numbers의 원소 중, 두 개를 곱해 만들 수 있는 최댓값 구하기
// 풀이 생각 : 정수 배열 정렬 -> 맨 앞 두개 곱, 맨 뒤 두개 곱 비교하기
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int result1 = 0;
        int result2 = 0;
        
        Arrays.sort(numbers);
        
        result1 = numbers[0] * numbers[1];
        result2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        int answer = Math.max(result1, result2);
        
        return answer;
    }
}